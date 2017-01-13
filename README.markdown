# Crouton
![Crouton](https://raw.github.com/keyboardsurfer/Crouton/master/sample/src/main/res/drawable-xhdpi/ic_launcher.png "Crouton logo")

Context sensitive notifications for Android

## DEPRECATION NOTICE

This library has passed it's prime and is now considered deprecated.

With the [Android Design Support Library](http://android-developers.blogspot.co.uk/2015/05/android-design-support-library.html)
introducing [Snackbar](https://developer.android.com/reference/android/support/design/widget/Snackbar.html) developers get a well
crafted pattern to use for context aware notification of users.

I won't do any active development for Crouton any more.
But I still do accept pull requests that fix bugs.

So long, and thanks for all the forks.

## Overview

**Crouton** is a class that can be used by Android developers that feel the need for an **alternative to the Context insensitive [Toast](http://developer.android.com/reference/android/widget/Toast.html)**.

A Crouton will be displayed at the position the developer decides.
Standard will be the top of an application window.
You can line up multiple Croutons for display, that will be shown one after another.

You can check some features in the Crouton Demo.

<a href="http://play.google.com/store/apps/details?id=de.keyboardsurfer.app.demo.crouton">
  <img alt="Crouton Demo on Google Play"
         src="http://developer.android.com/images/brand/en_generic_rgb_wo_60.png" />
</a>

If you're already using Crouton and just want to download the latest version of the library, follow [this link](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22de.keyboardsurfer.android.widget%22).

## [Releases / Changelog](https://github.com/keyboardsurfer/Crouton/releases)

### Current version: 1.8.5

## Usage

The API is kept as simple as the Toast API:

Create a Crouton for any CharSequence:

    Crouton.makeText(Activity, CharSequence, Style).show();
    
Create a Crouton with a String from your application's resources:

    Crouton.makeText(Activity, int, Style).show();
    
Further you can attach a Crouton to any ViewGroup like this:

    Crouton.makeText(Activity, int, Style, int).show();

    Crouton.makeText(Activity, int, Style, ViewGroup).show();
    
Also `Crouton.show(...)` methods are available for convenient fire and forget display of Croutons. 

If you would like a more graphical introduction to Crouton check out [this presentation](https://speakerdeck.com/keyboardsurfer/crouton-devfest-berlin-2012).

##Important!

In your Activity.onDestroy() make sure to call

    Crouton.cancelAllCroutons();
    
to cancel cancel all scheduled Croutons.

This is a workaround and further description is available in [issue #24](https://github.com/keyboardsurfer/Crouton/issues/24).

## Basic Examples
Currently you can use the three different Style attributes displayed below out of the box:

![Alert](https://github.com/keyboardsurfer/Crouton/raw/master/res/Alert.png "Example of Style.ALERT")

![Confirm](https://github.com/keyboardsurfer/Crouton/raw/master/res/Confirm.png "Example of Style.CONFIRM")

![Info](https://github.com/keyboardsurfer/Crouton/raw/master/res/Info.png "Example of Style.INFO")

## Extension and Modification

The whole design of a Crouton is defined by  [Style](https://github.com/keyboardsurfer/Crouton/blob/master/library/src/main/java/de/keyboardsurfer/android/widget/crouton/Style.java).

You can use one of the styles Crouton ships with: **Style.ALERT**, **Style.CONFIRM** and **Style.INFO**. Or you can create your own Style.

In general you can modify

- display duration
- dimension settings
- options for the text to display
- custom Views
- appearance & disappearance Animation
- displayed Image

Since [Style](https://github.com/keyboardsurfer/Crouton/blob/master/library/src/main/java/de/keyboardsurfer/android/widget/crouton/Style.java) is the general entry point for tweaking Croutons, go and see for yourself what can be done with it.

## Building

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency

```
	dependencies {
	        compile 'com.github.xingstarx:Crouton:1.8.6'
	}
```