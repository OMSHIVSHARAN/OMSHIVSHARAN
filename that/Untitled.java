I want you to recreate the GitHub profile repository from the reference ZIP I provided, as close to the original implementation and visual behavior as possible.

IMPORTANT:
Do NOT make a simplified README.
Do NOT redesign the concept.
Do NOT replace the SVG animations with static images.
Do NOT replace the ASCII portrait with a normal profile picture.
Do NOT remove the 3D ASCII wordmark.
Do NOT replace the animated contribution graph with GitHub's normal contribution image.

I want the SAME TYPE OF REPOSITORY and SAME IMPLEMENTATION STYLE as the reference:
- animated terminal-style ASCII portrait
- animated 3D extruded ASCII wordmark
- terminal title bars
- animated GitHub contribution heatmap
- real contribution data fetched from GitHub
- SVG animation using SMIL/CSS, not JavaScript
- Python scripts that generate the SVG assets
- GitHub Actions workflow that automatically refreshes contribution data
- source photo → processed photo → ASCII SVG pipeline
- generated wordmark SVG
- generated contribution SVG
- same README layout and visual proportions

The only major difference should be:
THE PROFILE MUST BELONG TO ME: OM SHIVSHARAN / OMSHIVSHARAN.

==================================================
1. MY IDENTITY
==================================================

Name:
OM SHIVSHARAN

GitHub username:
OMSHIVSHARAN

GitHub:
https://github.com/OMSHIVSHARAN

LinkedIn:
https://linkedin.com/in/om-shivsharan

LeetCode:
https://leetcode.com/u/WhileOmSleeps

Email:
omshivsharan777@gmail.com

Location:
Pune, India

Education:
B.E. Computer Engineering
PDEA's College of Engineering (COEM), Pune
Savitribai Phule Pune University (SPPU)
Aug 2023 – May 2027 (Expected)

Current positioning:
Computer Engineering Student • Software Developer • AI/ML Enthusiast

Do NOT invent a portfolio website.
Do NOT invent Instagram.
Do NOT invent other social links.

Only use links that actually exist above or to my real GitHub repositories.

==================================================
2. MY PHOTO
==================================================

I have provided my own portrait photo in this conversation.

USE MY PROVIDED PHOTO as the source for the ASCII portrait.

Do NOT use the person's photo from the reference repository.

Copy my provided photo into the repository as:

source-photo.jpg

Then process it through the same type of pipeline used by the reference repository:

source-photo.jpg
        ↓
prep_photo.py
        ↓
source-prepped.png
        ↓
make_ascii_svg.py
        ↓
om-ascii.svg

The final README must display:

./om-ascii.svg

instead of the reference's:

./avi-ascii.svg

The ASCII portrait should:
- be monochrome
- have a dark terminal-style background
- isolate the person from the background
- use grayscale luminance
- use an ASCII density ramp
- type/reveal itself row-by-row
- have a terminal title bar
- have the small blinking cursor/reveal effect
- finish in a stable readable state

Keep the same visual philosophy and dimensions as the reference.

==================================================
3. REFERENCE ASCII PORTRAIT IMPLEMENTATION
==================================================

Recreate the same behavior as the reference make_ascii_svg.py.

Important characteristics:

- approximately 100 ASCII columns
- approximately 53 rows
- monospace font
- dark terminal window
- rounded outer border
- terminal red/yellow/green buttons
- title:

om@github: ~$ ./portrait.sh

For my version use:

om@github: ~$ ./portrait.sh

The bottom status line should become:

om@github:~$ whoami OM Shivsharan

with the blinking terminal cursor.

Use a clean monochrome ASCII ramp similar to:

" .`:-=+*cs#%@"

Use:
- grayscale conversion
- contrast enhancement
- brightness adjustment
- gamma adjustment
- white background suppression
- row-by-row clip-path reveal
- animated cursor

Use SVG SMIL animation because the SVG will be embedded in GitHub README through <img>.

Do NOT use JavaScript inside the SVG.

==================================================
4. 3D ASCII WORDMARK
==================================================

This is extremely important.

The reference creates a 3D extruded ASCII wordmark and animates it.

I want the same system.

But instead of:

AVI

my wordmark must say:

OM

or, preferably if it remains readable at the same width:

OM SHIVSHARAN

If the full name becomes visually poor at the reference ASCII resolution, use:

OM

as the main 3D ASCII wordmark and keep:

OM SHIVSHARAN

in the surrounding terminal/profile text.

The wordmark must:
- be rendered using Python
- use a bold TTF/TTC font
- threshold the text into a mask
- create an extrusion/depth shell
- project the 3D surface
- rotate it
- z-buffer/rasterize it
- convert the rendered result to ASCII
- output SVG
- animate using a pre-rendered SVG flipbook
- use SMIL/discrete opacity animation
- wipe in from left to right
- gently rock around the vertical axis
- have the same terminal aesthetic

Generate:

wordmark.svg

using:

scripts/make_wordmark_svg.py

Keep the same architecture as the reference script.

The default mode should remain:

rock

The generated SVG should be used by README:

./wordmark.svg

==================================================
5. WORDMARK TERMINAL TITLE
==================================================

Reference:

avi@github ~ $ whoami

Change it to:

om@github ~ $ whoami

The portrait terminal should also use:

om@github: ~$ ./portrait.sh

The wordmark should visually sit beside the portrait just like the reference.

==================================================
6. CONTRIBUTION GRAPH
==================================================

Recreate the reference animated GitHub contribution graph system.

Use actual contribution data from:

https://github.com/users/OMSHIVSHARAN/contributions

The repository must contain:

data/contributions.json

scripts/fetch_contributions.py

scripts/generate_streak_svg.py

scripts/render_heatmap_svg.py

contrib-heatmap.svg

The fetch script must use:

USERNAME = os.environ.get("GH_PROFILE_USER", "OMSHIVSHARAN")

and:

https://github.com/users/{USERNAME}/contributions

It should parse the public GitHub contribution calendar and calculate:

- total contributions
- active days
- average contributions per active day
- current streak
- longest streak
- best day
- monthly totals
- daily contribution data

Do not hardcode my contribution numbers.

The workflow must fetch my REAL current GitHub data.

==================================================
7. CONTRIBUTION SVG
==================================================

Recreate the reference visual:

terminal-style contribution graph

with:
- dark background
- rounded border
- terminal red/yellow/green dots
- month labels
- Mon/Wed/Fri labels
- GitHub-style contribution squares
- Less → More legend
- animated reveal
- contribution statistics
- current streak
- longest streak
- best day

Change the terminal title from:

avi@github: ~/contributions --graph

to:

om@github: ~/contributions --graph

The contribution graph must represent:

OMSHIVSHARAN

not AVIVASHISHTA29.

==================================================
8. GITHUB ACTION
==================================================

Recreate:

.github/workflows/update-profile-art.yml

It should:

1. Run daily.
2. Allow manual workflow_dispatch.
3. Run when main is pushed.
4. Checkout repository.
5. Install Python.
6. Install scripts/requirements.txt.
7. Fetch real contribution data.
8. Generate contrib-heatmap.svg.
9. Commit updated data/SVG.
10. Push the changes.

Use:

permissions:
  contents: write

Use GitHub Actions versions compatible with current GitHub Actions.

The workflow must use:

GH_PROFILE_USER=OMSHIVSHARAN

or pass:

OMSHIVSHARAN

to the contribution generator.

Never leave:

AVIVASHISHTA29

anywhere in the final repository.

==================================================
9. README MUST MATCH THE REFERENCE STRUCTURE
==================================================

The README should be extremely close to the reference README structure.

Use this structure:

<div align="center">

<h3><code>om@github ~ $ whoami</code></h3>

<table>
<tr>
<td valign="top">
<img src="./om-ascii.svg" width="370" alt="Om Shivsharan — ASCII portrait" />
</td>

<td valign="top">
<img src="./wordmark.svg" width="490" alt="OM — 3D ASCII wordmark" />
</td>
</tr>
</table>

<br>
<br>

<h3><code>om@github ~ $ ./contributions.sh</code></h3>

<img
src="./contrib-heatmap.svg"
width="860"
alt="Om Shivsharan's GitHub contribution graph — auto-refreshed daily"
/>

<br>
<br>

<h3><code>om@github ~ $ ./links.sh</code></h3>

<p><b>Software Developer · AI/ML Enthusiast · Full-Stack Developer</b></p>

[![LinkedIn](https://img.shields.io/badge/LinkedIn-om--shivsharan-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/om-shivsharan)

[![GitHub](https://img.shields.io/badge/GitHub-OMSHIVSHARAN-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/OMSHIVSHARAN)

[![LeetCode](https://img.shields.io/badge/LeetCode-WhileOmSleeps-FFA116?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/u/WhileOmSleeps)

<br>

</div>

==================================================
10. DO NOT ADD A NORMAL LONG PROFILE README
==================================================

The visual centerpiece is the animated artwork.

Do NOT turn the README into a conventional:

About Me
Skills
Projects
Experience
Education

resume-style README.

Keep the minimal terminal aesthetic of the reference.

The reference's README is visually sparse and relies heavily on the generated SVG artwork.

==================================================
11. MY INFORMATION
==================================================

Where text about me is necessary, use:

OM SHIVSHARAN

Computer Engineering Student
Software Developer
AI/ML Enthusiast

Skills:

C++
Python
JavaScript
SQL
Django
React.js
REST APIs
HTML5
CSS3
Pandas
NumPy
Matplotlib
TensorFlow
LSTM
Machine Learning
Data Analysis
DSA
OOP
DBMS
Operating Systems
Git
GitHub
MySQL
Razorpay API
Supabase
Vite
TypeScript

Do not claim technologies that aren't listed above.

==================================================
12. MY PROJECTS
==================================================

Use my real repositories.

CryptoRacket:
https://github.com/OMSHIVSHARAN/CryptoRacket

E-Commerce:
https://github.com/OMSHIVSHARAN/ecom_internship

ML-DL-Journey:
https://github.com/OMSHIVSHARAN/ML-DL-Journey

LeetCode-Solutions:
https://github.com/OMSHIVSHARAN/LeetCode-Solutions

anime-vscode-companion:
https://github.com/OMSHIVSHARAN/anime-vscode-companion

Not-Hot-Dog:
https://github.com/OMSHIVSHARAN/Not-Hot-Dog

backend.py:
https://github.com/OMSHIVSHARAN/backend.py

Do not invent repository names.

==================================================
13. EXPERIENCE
==================================================

If an experience section is needed anywhere in the README/artwork, use:

Full Stack Developer Intern
BrainyBeam Technologies Pvt. Ltd.
May 2025 – Jul 2025

Relevant work:
- Django + MySQL e-commerce application
- OTP-based email verification
- Shopping cart
- Order management
- Razorpay payment integration
- MySQL schema optimization
- Django MVT components
- Responsive UI

==================================================
14. LEETCODE
==================================================

Use:

LeetCode:
https://leetcode.com/u/WhileOmSleeps

Current claim:

100+ problems solved

Main topics:

Arrays
Dynamic Programming
Graphs
Trees
Binary Search

Do NOT fabricate a precise current LeetCode count.

If the profile can be dynamically fetched, use live data.
Otherwise say 100+.

==================================================
15. HACKATHONS
==================================================

Use:

Smart India Hackathon — National Level

Codelite Hackathon

==================================================
16. CERTIFICATIONS
==================================================

Use:

Code Unnati – Foundation Program in Python, AI & SAP Chatbot

Designing Data Models & Transforming Data in SAP Analytics Cloud

Designing Stories in SAP Analytics Cloud

Deloitte Australia – Data Analytics Job Simulation

==================================================
17. FILE STRUCTURE
==================================================

Final repository should look approximately like:

OMSHIVSHARAN/
│
├── README.md
├── source-photo.jpg
├── source-prepped.png
├── om-ascii.svg
├── wordmark.svg
├── contrib-heatmap.svg
│
├── data/
│   └── contributions.json
│
├── scripts/
│   ├── fetch_contributions.py
│   ├── generate_streak_svg.py
│   ├── make_ascii_svg.py
│   ├── make_wordmark_svg.py
│   ├── prep_photo.py
│   ├── render_heatmap_svg.py
│   └── requirements.txt
│
├── docs/
│   └── 3d-ascii-wordmark.md
│
└── .github/
    └── workflows/
        └── update-profile-art.yml

==================================================
18. PYTHON DEPENDENCIES
==================================================

Use appropriate dependencies for:

- requests
- beautifulsoup4
- Pillow
- numpy
- OpenCV
- background removal

The reference uses a background-removal pipeline.

Make sure the requirements.txt is actually complete.

If prep_photo.py uses:

rembg
cv2

then requirements.txt MUST include the corresponding packages.

Do not leave a script depending on a package that isn't listed in requirements.txt.

==================================================
19. PHOTO PROCESSING
==================================================

My uploaded image has a blue background and a portrait of me.

The processing should try to:

1. isolate the person
2. remove the blue background
3. create a clean alpha mask
4. apply grayscale
5. apply CLAHE/local contrast
6. slightly lift the image
7. composite the subject over white
8. feed it to ASCII conversion

The result should make the face recognizable when converted to ASCII.

Do not distort the face unnecessarily.

Keep the crop/head proportions similar to the original portrait.

==================================================
20. ASCII ART QUALITY
==================================================

This is important.

Do not simply convert the image to ASCII using a basic 20-column text output.

Use the reference-style SVG generation.

The ASCII should be generated as:

<text>

elements inside an SVG.

Each row should have:

textLength

and:

lengthAdjust="spacing"

so the character grid stays aligned.

Use:

font-family="ui-monospace, SFMono-Regular, Menlo, Consolas, monospace"

The SVG must remain reasonably sized.

==================================================
21. ANIMATION RULE
==================================================

GitHub README SVG animations must NOT rely on JavaScript.

Use:

- SMIL
- clipPath
- animate
- set
- SVG opacity
- CSS keyframes where appropriate

Portrait:
- rows reveal sequentially
- cursor follows reveal
- final image stays visible
- bottom cursor can blink

Wordmark:
- left-to-right reveal
- then subtle rocking motion
- pre-rendered frames
- discrete opacity flipbook

Contribution graph:
- cells reveal progressively
- then remain visible

==================================================
22. WORDMARK GENERATOR DETAILS
==================================================

Keep the reference generator architecture:

1. draw text with bold font
2. threshold mask
3. construct surface shell
4. front cap
5. back cap
6. side walls
7. calculate normals
8. rotate
9. project
10. depth sort/z-buffer
11. rasterize to ASCII
12. generate SVG frames
13. animate frames using SMIL

Use a reasonable Linux-compatible font for GitHub Actions.

IMPORTANT:
The reference used a macOS Futura font path.

Do NOT leave:

/System/Library/Fonts/Futura.ttc

as the only option because GitHub Actions runs Linux.

Use a portable font such as a font installed by the workflow, or implement a fallback font search.

For example, support:

/usr/share/fonts/truetype/dejavu/DejaVuSans-Bold.ttf

or another available bold font.

==================================================
23. LOCAL PREVIEW
==================================================

I want to be able to preview everything locally before uploading it to GitHub.

Create a simple local workflow.

Commands should be documented in SETUP.md.

Example:

python -m venv .venv

Windows:

.venv\Scripts\activate

Install:

pip install -r scripts/requirements.txt

Then:

python scripts/prep_photo.py source-photo.jpg source-prepped.png

Then:

python scripts/make_ascii_svg.py source-prepped.png om-ascii.svg

Then:

python scripts/make_wordmark_svg.py --mode rock --out wordmark.svg

For contribution data, provide a local option that works with the public API/HTML.

Then open README.md in VS Code Markdown Preview.

Also provide an optional simple local server:

python -m http.server 8000

so the generated SVGs can be inspected in a browser.

==================================================
24. README VISUAL PROPORTIONS
==================================================

Match the reference proportions:

ASCII portrait:
width approximately 370

3D wordmark:
width approximately 490

Contribution graph:
width approximately 860

The portrait and wordmark should appear side-by-side.

The contribution graph should appear underneath.

Do not use huge headings or excessive text.

The main focus should be:

ASCII portrait
+
3D ASCII name
+
animated contribution graph
+
links

==================================================
25. REMOVE ALL REFERENCE IDENTITY
==================================================

Search the entire finished repository for:

AVIVASHISHTA29
Avi Vashishta
avi@github
avi_vashishta29
avivashishta.com
avi-ascii.svg

There must be ZERO references remaining.

Also inspect generated SVGs for those strings.

Replace everything with my identity.

==================================================
26. USE MY USERNAME IN ALL DYNAMIC CODE
==================================================

All dynamic GitHub URLs must point to:

OMSHIVSHARAN

Examples:

https://github.com/users/OMSHIVSHARAN/contributions

https://github.com/OMSHIVSHARAN

Do not accidentally leave the reference username inside:
- Python defaults
- workflow files
- generated SVG metadata
- alt text
- comments
- docs
- JSON
- README

==================================================
27. TERMINAL TEXT
==================================================

Use:

om@github ~ $ whoami

om@github: ~$ ./portrait.sh

om@github ~ $ ./contributions.sh

om@github: ~/contributions --graph

om@github ~ $ ./links.sh

For the final status line:

om@github:~$ whoami OM Shivsharan

==================================================
28. FINAL QUALITY CHECK
==================================================

Before finishing:

1. Run every Python script.
2. Make sure all SVG files are actually generated.
3. Open/check the generated SVGs.
4. Check that the portrait is recognizable.
5. Check that the wordmark is readable.
6. Check that the contribution graph renders.
7. Check that the README references the correct filenames.
8. Search for old reference identity.
9. Search for broken paths.
10. Make sure GitHub Actions can run on Ubuntu.
11. Make sure requirements.txt contains every required package.
12. Make sure the repository works without JavaScript.
13. Make sure animations use SVG/CSS only.
14. Make sure all links are my real links.

==================================================
29. IMPORTANT FINAL OUTPUT
==================================================

Do not just give me snippets.

Actually create the complete repository.

I want:

README.md
source-photo.jpg
source-prepped.png
om-ascii.svg
wordmark.svg
contrib-heatmap.svg
data/contributions.json
all Python scripts
requirements.txt
GitHub Actions workflow
docs
SETUP.md

Then give me:

1. the complete folder structure
2. the commands to run it locally
3. how to preview it
4. how to upload it to:
   https://github.com/OMSHIVSHARAN/OMSHIVSHARAN

The finished result should visually feel like the reference repository, but it must clearly be MY GitHub profile.

Do not simplify it.
Do not replace the animations with static images.
Do not use the reference person's photo.
Do not use the reference person's name.
Use my supplied photo and my identity.