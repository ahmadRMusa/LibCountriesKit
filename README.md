# LibCountriesKit
### Android Flag Kit Clone which provides the beautiful flags and the country names for Android developers


Flag Kit repo: https://github.com/madebybowtie/FlagKit 

# Features:

## Provides List of Country Codes:
     LibCK.availableCountryCodesArray() Or availableCountryCodesSet() Or LibCK.availableCountryCodesList()

## Provide List Of Countries:
    LibCK.getCountriesList(Context context)
## Get The Country By Country Code:
    LibCK.getCountryByCode(Context context, String countryCode)
## Get Country Name by Country Code:
    LibCK.getCountryNameByCode(Context context, String countryCode)
## Get Flag As Drawable By Country Code:
 #### No theme applied :
    LibCK.getFlagDrawable(Context context, String countryCode)
#### Or Applying The Context Theme:
    LibCK.getCompatFlagDrawable(Context context, String countryCode)
    
# Usage:
##### Add jetback repository to your gradle file:

    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

##### Add the dependency to your project:
    	dependencies {
	        compile 'com.github.ahmadRMusa:LibCountriesKit:dev-SNAPSHOT'

	}


