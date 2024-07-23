// if two intervals are ovelapping, and I remove one interval out of the two overlapping ones, then there won't be anyoverlapping 
// if three intervals are overlapping there would be 2 cases:
// one interval common between other two is in the middle : removing this one would do the job
// one --- " --------------------------- is on the edge : we need to remove two intervals which are common
//
// making cases of minimum would be too much; we make cases of maximum then remove these from the total to get minimum
// find the maximum number of non-overlapping interval, i.e the end time of previous must be less than start time of next
// this time the sorting will be based on end time. this way if an activity that starts first but ends too late is encounterd, it will be at the end of the list
