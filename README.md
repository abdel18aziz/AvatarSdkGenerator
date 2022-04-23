# AvatarSdkGenerator
I wrote this Java code to automate the generation of avatars from a list of folders that contains pictures of people that does not exist , it uses the standalone local compute solution of avatarSDK for local avatar generation. 
this repository does not containe any avatarsdk licence file or library file. 
step 1 : download Local Compute standalone application from avatarsdk and don't forget the licence file.
step 2 : put the avatar sdk stand alone file and folders in the directory of the java project.
step 3 : put the folders that containe the pictures in tha same directory as the java project.
step 4: run the code.
Note that by adding more folders you will need to make a thread for each folder in the main function.
example : 
TheThread folderNX = new TheThread("folder");
folderNx.start();

