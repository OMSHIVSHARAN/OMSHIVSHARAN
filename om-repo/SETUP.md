# Local setup & preview

Everything in this repo (portrait, wordmark, contribution graph) is generated
by the scripts in `scripts/`. The generated SVGs are committed to the repo, so
you only need to re-run a script when its input changes (a new photo, a new
wordmark text/font) or, for the contribution graph, when you want fresh data —
which the daily workflow already does for you automatically.

## 1. Environment

```bash
python -m venv .venv
```

Activate it:

```bash
# macOS / Linux
source .venv/bin/activate

# Windows
.venv\Scripts\activate
```

Install dependencies:

```bash
pip install -r scripts/requirements.txt
```

## 2. Regenerate the ASCII portrait

Only needed when `source-photo.jpg` changes.

```bash
python scripts/prep_photo.py source-photo.jpg source-prepped.png
python scripts/make_ascii_svg.py source-prepped.png om-ascii.svg
```

`prep_photo.py` downloads a small background-removal model the first time it
runs (cached afterwards under `~/.rembg`).

## 3. Regenerate the 3D ASCII wordmark

Only needed when the text, font, or framing changes.

```bash
python scripts/make_wordmark_svg.py --mode rock --out wordmark.svg
```

Other modes for eyeballing a render: `--mode static` (single frozen frame,
fastest to inspect), `--mode once` (one full turn then freeze), `--mode spin`
(continuous turntable). See `docs/3d-ascii-wordmark.md` for the full pipeline
write-up and the env vars that control text/font/sizing.

## 4. Refresh the contribution graph

This is what the daily GitHub Action does — you can run it locally too:

```bash
python scripts/fetch_contributions.py       # scrapes github.com/users/OMSHIVSHARAN/contributions
python scripts/render_heatmap_svg.py        # data/contributions.json -> contrib-heatmap.svg
```

Both read/write relative to the repo root regardless of your working
directory. To preview a different account's graph without touching your own
data file, set `GH_PROFILE_USER`:

```bash
GH_PROFILE_USER=someone-else python scripts/fetch_contributions.py
```

## 5. Preview the README

Open `README.md` in VS Code and use the built-in Markdown Preview
(`Ctrl+Shift+V` / `Cmd+Shift+V`), or serve the folder and open it in a browser
so the SVG animations actually play (VS Code's preview pane does not always
run SMIL/CSS animations reliably):

```bash
python -m http.server 8000
```

Then open `http://localhost:8000/README.md` — GitHub-flavored Markdown won't
render outside GitHub itself, but you can open the SVG files directly
(`http://localhost:8000/om-ascii.svg`, `.../wordmark.svg`,
`.../contrib-heatmap.svg`) in a tab to watch each animation play.

## 6. Push to GitHub

```bash
git init
git remote add origin https://github.com/OMSHIVSHARAN/OMSHIVSHARAN.git
git add -A
git commit -m "init: profile README"
git branch -M main
git push -u origin main
```

Once pushed, `.github/workflows/update-profile-art.yml` takes over: it runs
daily, on every push to `main`, and on-demand from the Actions tab, refreshing
`data/contributions.json` and `contrib-heatmap.svg` and committing the result
back with `[skip ci]`.
