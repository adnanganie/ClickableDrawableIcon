# ClickableDrawableIcon
  Handling click events on a drawableIcon within a TextInputEditText
# SdkVersion 
  minSdkVersion 19
  
# Add the JitPack repository to your build file
  *Add it in your root build.gradle at the end of repositories:

		allprojects {
      repositories {

        maven { url 'https://jitpack.io' }
      }
	} 
  
  # Add the dependency
      dependencies {
	        implementation 'com.github.adnanganie:ClickableDrawableIcon:v1.0'
	    }
# Handle click on drawableSTART and drawableEND

	 <com.adnan.clickabledrawable.CustomTextInputEditText
            android:id="@+id/et_mobile_no"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:drawableStart="@drawable/ic_contact_book"
            android:drawableLeft="@drawable/ic_contact_book"
            android:drawableEnd="@drawable/ic_contact_book"
            android:drawableRight="@drawable/ic_contact_book"
            android:inputType="number"
            android:maxLength="13" />
