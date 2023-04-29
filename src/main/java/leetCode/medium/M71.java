package leetCode.medium;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class M71 {

    public String simplifyPath1( String path ) {
        String[] arr = path.trim().split( "/" );
        StringBuilder sb = new StringBuilder();
        Deque<String> stack = new LinkedList<>(); 

        for ( String s : arr ) {
            if ( s.equals( "." ) || s.equals( "" ) ) {
                continue;
            } else if ( s.equals( ".." ) ) {
                if ( !stack.isEmpty() ) {
                    stack.pop();
                }
            } else {
                stack.push( s );
            }
        }
        while ( !stack.isEmpty() ) {
            sb.append( "/" ).append( stack.pollLast() );
        }
        if ( sb.length() > 1 ) {
            sb.deleteCharAt( sb.length() - 1 );
        }
        return sb.toString();
    }

    public String simplifyPath2( String path ) {
        StringTokenizer st = new StringTokenizer( path, "/" );
        StringBuilder sb = new StringBuilder( "/" );
        List<String> tokens = new LinkedList<>();
        while ( st.hasMoreElements() ) {
            tokens.add( st.nextToken() );
        }
        if ( tokens.contains( "." ) ){
            tokens.removeAll(List.of( "." ) );
        }
        while ( tokens.contains( ".." ) ){
            int index = tokens.indexOf( ".." );
            if ( index > 0 ) {
                tokens.remove( index );
                tokens.remove( index - 1 );
            } else {
                tokens.remove( index );
            }
        }
        for ( String token : tokens ) {
            sb.append( token ).append( "/" );
        }
        if ( sb.length() > 1 ) {
            sb.deleteCharAt( sb.length() - 1 );
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println( new M71().simplifyPath1("/home/" ));
    }
}
