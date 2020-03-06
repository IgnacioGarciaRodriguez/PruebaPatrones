package Factory;

class GifReader implements ImageReader {
    private DecodedImage decodedImage;

    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}
