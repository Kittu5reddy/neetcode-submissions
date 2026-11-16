class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sorted_list=set("".join(sorted(i)) for i in strs)
        hash_map={i:[] for i in sorted_list}
        for i in strs:
            key="".join(sorted(i))
            if key in sorted_list:
                hash_map[key].append("".join(i))
            
        return list(hash_map.values())