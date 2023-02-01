package hierarchy;

public class ImageFile extends File {

    protected int width;
    protected int height;
    protected byte[] content;

    ImageFile(String fullName,
              int width,
              int height,
              byte[] content) {
        super(fullName);
        this.width = width;
        this.height = height;
        this.content = content;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    protected String getFileInfo() {
        return String.format("Image: %s, width: %d, " +
                "height: %d", fullName, width, height);
    }

}
