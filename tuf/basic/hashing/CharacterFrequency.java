public class CharacterFrequency {
    public static void main(String[] args) {
        String s="abcdabc";
        String freq="ab";
        System.out.println("Brute Force");
        for(int i=0;i<freq.length();i++){
            System.out.println(bruteForce(freq.charAt(i),s)+" ");
        }
        System.out.println("Small Letter Frequency");
        smallLetterfrequency(s,freq);
        System.out.println("Capital Letter Frequency");
        capitalLetterfrequency(s.toUpperCase(),freq.toUpperCase());
        System.out.println("Small and Capital Letter Frequency");
        lowerUpperCaseLetterFrequency(s.concat(s.toUpperCase()),freq.concat(freq.toUpperCase()));
    }

    private static int bruteForce(char ch, String s){
        
        int count=0;
        for(int i=0; i<s.length();i++){
            if(ch==s.charAt(i)){
                count++;
            }
        }
        return count;
    }

    //ascii value of a=97 now b=98 so in hash b-a=1
    // 0->a 1->b 2->c .................
    private static void smallLetterfrequency(String s, String freq){
        int[] hash=new int[26];
        for(int i=0; i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        for(int i=0; i<freq.length();i++){
            System.out.println(hash[freq.charAt(i)-'a']);
        }
    }
    
    //ascii value of a=65 now B=66 so in hash B-A=1
    // 0->A 1->B 2->C .................
    private static void capitalLetterfrequency(String s, String freq){
        int[] hash=new int[26];
        for(int i=0; i<s.length();i++){
            hash[s.charAt(i)-'A']++;
        }
        for(int i=0; i<freq.length();i++){
            System.out.println(hash[freq.charAt(i)-'A']);
        } 
    }

        //ascii value of a=65 now B=66 so in hash B-A=1
    // 0->A 1->B 2->C .................
    private static void lowerUpperCaseLetterFrequency(String s, String freq){
        int[] hash=new int[256];
        for(int i=0; i<s.length();i++){
            hash[s.charAt(i)]++;
        }
        for(int i=0; i<freq.length();i++){
            System.out.println(hash[freq.charAt(i)]);
        } 
    }
}
