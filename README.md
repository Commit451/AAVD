# Awesome Animated Vector Drawables
Awesomely awesome animated vector drawables for all!

[![Build Status](https://travis-ci.org/Commit451/AAVD.svg?branch=master)](https://travis-ci.org/Commit451/AAVD)

Features great animated vector drawables, created from scratch or taken from other amazing open source projects. Feel free to make a pull request to include your own!

See the sample app for a running list of all the drawables in action!

# Gradle Dependency

### Repository

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

### AAVD Module (3.0+)
This module contains animated vector drawables which, thanks to AnimatedVectorDrawableCompat, can work on ALL devices API 11+ by making use of the support library via AppCompat. See more [here](http://android-developers.blogspot.com/2016/02/android-support-library-232.html)
```gradle
dependencies {
	...
    compile('com.github.commit451.AAVD:aavd:0.0.1@aar') {
        transitive = true
    }
}
```

### AAVD Path Module (5.0+)
This module contanis animated vector drawables which at this point only work on API 21+ due to the fact that they rely on animating the path of a vector. See [this blog post by Chris Banes](https://medium.com/@chrisbanes/appcompat-v23-2-age-of-the-vectors-91cbafa87c88#.gzhzsvkrf) for more details.
```gradle
dependencies {
	...
    compile('com.github.commit451.AAVD:aavd-path:0.0.1@aar') {
        transitive = true
    }
}
```

# Usage
All the available animated vector drawables begin with the prefix `aavd_avd`. It is an annoyingly long prefix, but it assures that the drawables will never collide with ones you create in your app.
As far as playing out an animation, you simply call:
```java
AnimatedVectorDrawableCompat drawable = AnimatedVectorDrawableCompat.create(context, R.drawable.aavd_avd_likes);
imageView.setImageDrawable(drawable);
//... then later, in an on click listener or some other interaction
Drawable drawable = imageView.getDrawable();
if (drawable instanceof Animatable) {
    ((Animatable) drawable).start();
}
```

This library simply provides the drawable resources for you to use. It is basically a resource only library (no Java code). Its purpose is not to help you keep track of the state of the animations. This should be done in a case by case basis, but most of the time, you just need a single boolean value to keep track of which animation needs to play next.

License
--------

    Copyright 2016 Commit 451

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
