# BucketList

![BucketList Icon] (https://github.com/NCSUMobiles/Spring15-bucketmap1/blob/Master/app/src/main/res/drawable/logo.png)

#The Team:

Alexis Covington

Nikhil Nayak

Kurt Spencer

Abhinav Srinivasan 

Neha Vinod Ahir


#Core Problem:

We wanted to create a mobile application that allows users to find places of interest, group them together in buckets, rate the places they've visited and share this information with friends. Our application lets users create buckets, find places using google maps, and add them to buckets.


#Application features:

Sign in through Google+: A user can sign in to the application using a Google+ account. This avoids the overhead of creating a new account with new credentials.

Creating a bucket:  A user can create different types of buckets through the application. The application provides various options for bucket styles.

Exploring the map to add places to the bucket list: The user can explore a map, find a place of interest and add it to any of the buckets.

Rating and reviewing a place: Once a user visits any of the places, he can rate the places and add reviews about it.

Sharing a Bucket: The application also allows a user to share buckets through Google+. The buckets can either be shared publicly or with specific users. Buckets can be shared with or without pictures.

Top Bucket Listing: The app provides a list of top rated places based on ratings given by the user for visited places.


#Application technology stack:

We have developed this application to work on the android operating system.

Google+:
We used Google+ for authenticating a user.
We also used Google+ to share buckets and places with other users.

Google maps API:
We display the map screen based on Google Maps APIs.
The Google geolocate API is used to retrieve addresses during searches.

SQLite:
All our data is stored per user in a SQLite database on the device.
This lets multiple users use the app, while allowing each user to have a private list of buckets and places.


#Future Work:

The application currently needs the user to input the entire word for searching.  An important utility could be to add an auto-complete feature for search.
The application supports Google+ login. One of the future works could be to integrate Facebook login as well.
Sharing of buckets, in the future, could be done directly through the app instead of using Google+, which is the current technique.
One of the future items is integrating the Places API for information about places on the map, so that more information can be displayed.
The bucket icons can be customized to the choice of the user.
The overall look and feel of the user interface can be improved upon as a future work item.
The places of pictures can be added to the place information page.


#Github:
https://github.com/avsmith3/BucketList

#Screencast:
https://youtu.be/dyKT8zavGCE