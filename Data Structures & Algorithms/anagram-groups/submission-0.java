class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> result=new HashMap<>();
        for(String word:strs){
            char[] wordArray =word.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord=String.valueOf(wordArray);
            result.putIfAbsent(sortedWord,new ArrayList<>());
            result.get(sortedWord).add(word);
        }
        return new ArrayList(result.values());
    }
}
