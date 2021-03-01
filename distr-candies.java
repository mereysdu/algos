class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<Integer>();
        
        for(int i : candyType) {
            if(!types.contains(i)) {
                types.add(i);
                // System.out.println(i);
            }
        }
        
        int halfCandyType = candyType.length/2;
        int lenTypes = types.size();
        
        if(halfCandyType >= lenTypes) {
            return lenTypes;
        }
        // System.out.println(types.size());
        
        return halfCandyType;
    }
}
