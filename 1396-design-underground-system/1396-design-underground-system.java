class UndergroundSystem {
    
    public HashMap<Integer,Pair<String,Integer>> checkInMap;
    public HashMap<String, Pair<Double, Integer>> tripDetails;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        tripDetails = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new Pair<>(stationName,t));
       
    }
    
    public void checkOut(int id, String stationName, int t) {
    
        String checkInStation = checkInMap.get(id).getKey();
        int checkInTime = checkInMap.get(id).getValue();
        
        String toAndFrom = checkInStation + "-" + stationName;
      
        Pair<Double, Integer> timeDetails = tripDetails.getOrDefault(toAndFrom, new Pair<>(0.0,0));
        
        Double totalTime = timeDetails.getKey();
        Integer totalTrips = timeDetails.getValue();
        double tripTime = t - checkInTime;
        
        tripDetails.put(toAndFrom ,new Pair<>(totalTime + tripTime, totalTrips+1));
    
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String toAndFrom = startStation + "-" + endStation;
        Double totalTime = tripDetails.get(toAndFrom).getKey();
        int totalTrips = tripDetails.get(toAndFrom).getValue();
        
        return (double) totalTime/totalTrips;
        
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */