package textblocks;

public class TextBlocksDemo {

    public static void main(String[] args) {
        String textBlock = """
                This is a very, very long String... So I \
                think this should be a good use case for \
                my text block feature demo.\s
                PS: You can also include line breaks ;)\
                """;
        System.out.println(textBlock);
    }
}
