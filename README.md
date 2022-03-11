# Introduction
Application to display near-by electric vehicles charging spots.

# Packages 
1. data -  It contains all the data accessing and manipulating components.
2. domain - Here ViewModel holding data for UI.
3. ui - It has MainActivity which shows data collected from ViewModel.


# Feature
1. Display a list of the near-by charging spots based on the user’s current location.
2. Display address information.
3. The list has charging spot title, address title and distance from current location
4. Have a setting menu to set max result to be fetched.
5. Here is what the UI looks like ->

 https://ibb.co/BZTJpMH


# Overview
  1. LiveData - To updates app component MainActivity from ViewModel.
  2. Coroutine - To perform background operation
  3. Retrofit - For API call
  4. Dagger - for dependency injection
 

# Architecture
Used Google MVVM architecture.
  1. MVVM with ViewModel and Repository to avoid logical code in Activity.
  2. Loose coupling by making code dependent on interfaces rather than implementations
     eg:  ElectricChargeSpotRepository, SettingSharePref

# Possible Improvement
  1. Caching the charging spots info in the local db 
     and syncing it for user experience.
  2. Add unit test and ui tests 
  3. Few functionality not completed because of time constraint
