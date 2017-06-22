# DexParserKotlinInterfaceBugApp
Sample application to be used as test for linkedin's dex-test-parser current bug when parsing kotlin intefaces

The project consists on two activities having the same behavior.
So, to test the same behavior twice, a [kotlin interface](https://github.com/thalescm/DexParserKotlinInterfaceBugApp/blob/master/app/src/androidTest/java/machado/thales/dexparserkotlininterfacebugapp/SurpriseButtonTest.kt) was created.

Both [MainActivity](https://github.com/thalescm/DexParserKotlinInterfaceBugApp/blob/master/app/src/androidTest/java/machado/thales/dexparserkotlininterfacebugapp/MainActivityTest.kt) and [Main2Activity](https://github.com/thalescm/DexParserKotlinInterfaceBugApp/blob/master/app/src/androidTest/java/machado/thales/dexparserkotlininterfacebugapp/Main2ActivityTest.kt) test implement this interface, and each one have theirn own unique test, resulting in 4 UI tests.

When running dex-test-parser, it also generate more two tests, as if the interface could run.

E.g current Alltests.txt:
```
machado.thales.dexparserkotlininterfacebugapp.Main2ActivityTest#testClickWillShowSurprise
machado.thales.dexparserkotlininterfacebugapp.Main2ActivityTest#testHelloWorldTextIsPresent
machado.thales.dexparserkotlininterfacebugapp.MainActivityTest#testClickWillShowSurprise
machado.thales.dexparserkotlininterfacebugapp.MainActivityTest#testHelloWorldTextIsPresent
machado.thales.dexparserkotlininterfacebugapp.SurpriseButtonTest#testClickWillShowSurprise
machado.thales.dexparserkotlininterfacebugapp.SurpriseButtonTest$DefaultImpls#testClickWillShowSurprise
```

while it should not have the last two tests.
