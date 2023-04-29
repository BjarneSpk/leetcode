package leetCode.medium;

public class M535 {
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder sb = new StringBuilder( longUrl );
        for ( int i = 0; i < sb.length(); i++ ) {
            char c = (char) ( sb.charAt(i) + 1 );
            sb.setCharAt( i, c );
        }
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        StringBuilder sb = new StringBuilder( shortUrl );
        for ( int i = 0; i < sb.length(); i++ ) {
            char c = (char) ( sb.charAt(i) - 1 );
            sb.setCharAt( i, c );
        }
        return sb.toString();
    }
}
