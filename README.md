## C²

C² is an Android application that monitors an account on [The City](http://onthecity.org) for new messages and provides native notifications for them.

### Building

Assuming you have the Android SDK installed, you can build the APK using the following command:

    ant debug

Note that this will build a debug package, which cannot be uploaded to the Play Store. If you wish to install the package on a connected device, run the following command:

    ant debug install

