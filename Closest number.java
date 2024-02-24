arr.sort(null);
        
        // Initialize variables to store the minimum difference and the list of closest pairs
        int minDiff = Integer.MAX_VALUE;
        List<Integer> closestPairs = new ArrayList<>();
        
        // Iterate through the array to find the minimum difference and the pairs with that difference
        for (int i = 1; i < arr.size(); i++) {
            int diff = Math.abs(arr.get(i) - arr.get(i - 1));
            
            // Update the minimum difference
            if (diff < minDiff) {
                minDiff = diff;
                closestPairs.clear();
                closestPairs.add(arr.get(i - 1));
                closestPairs.add(arr.get(i));
            } else if (diff == minDiff) {
                // If the difference equals the minimum difference, add the pair to the list
                closestPairs.add(arr.get(i - 1));
                closestPairs.add(arr.get(i));
            }
        }
        
        return closestPairs;
