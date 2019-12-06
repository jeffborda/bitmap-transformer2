# BitMap Transformer 2

This is a refresher of the lab which implements a bitmap transformer Command Line Interface (CLI). It reads in a bitmap 
image from disk, run one or more color or raster transformations and then write it out to a new file.

## How To Run
Run using CLI with `./gradlew run --args`. Arguments are:

1. Input bmp filename. Loads from local `/bmp-images` directory. No '.bmp' required.
2. Output bmp filename. Also saves to `/bmp-images` directory. No '.bmp' requred.
3. Transformation to run. Choose from: `flipVertically`, `flipHorizontally`, or `addRedBorder`.

Example:
`./gradlew run --args 'nice_day after_transform flipvertically'`
