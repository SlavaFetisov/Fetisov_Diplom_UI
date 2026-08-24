# Проект по автоматизации тестирования интернет-магазина [AMK](https://shop.proamk.ru/)

<p align="center">  
<img alt="shop.proamk" src="/media/screenshots/amk.jpg">



> Измените внешний вид Вашего дома в короткий срок с минимальными вложениями


<a name="наверх"></a>

## :scroll: Содержание:

* <a href="#tools">Используемый стек</a>
* <a href="#cases">Примеры автоматизированных тест-кейсов</a>
* <a href="#console">Запуск из терминала</a>
* <a href="#jenkins">Сборка в Jenkins</a>
* <a href="#allure">Allure отчет</a>
* <a href="#allure-testops">Интеграция с Allure TestOps</a>
* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>

____
<a id="tools"></a>

## :computer:<a name="Используемый стек">**Используемый стек:**</a>

<p align="center">
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/logo/Java.svg"></a>
<a href="https://selenide.org/"><img width="6%" title="Selenide" src="media/logo/Selenide.svg"></a>
<a href="https://aerokube.com/selenoid/"><img width="6%" title="Selenoid" src="media/logo/Selenoid.svg"></a>
<a href="https://github.com/allure-framework/allure2"><img width="6%" title="Allure Report" src="media/logo/Allure.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/logo/Allure_TO.svg"></a>
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="media/logo/Gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit5" src="media/logo/Junit5.svg"></a>
<a href="https://github.com/"><img width="6%" title="GitHub" src="media/logo/GitHub.svg"></a>
<a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="media/logo/Jenkins.svg"></a>
<a href="https://web.telegram.org/a/"><img width="6%" title="Telegram" src="media/logo/Telegram.svg"></a>
<a href="https://www.atlassian.com/ru/software/jira/"><img width="5%" title="Jira" src="media/logo/Jira.svg"></a>
<a href="https://www.jetbrains.com/ru-ru/idea/"><img width="5%" title="IntelliJ" src="media/logo/idea.svg"></a>
</p>

____
<a id="cases"></a>

## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>

____

- :white_check_mark: Проверка элементов главного меню
- :white_check_mark: Параметризованная проверка поиска товара
- :white_check_mark: Параметризованная проверка фильтрации товаров
- :white_check_mark: Проверка фильтрации по цене товара
- :white_check_mark: Проверка добавления товара в корзину с главной страницы
- :white_check_mark: Проверка добавления товара в корзину из главного меню
- :white_check_mark: Проверка удаления товара из корзины

<a id="console"></a>

## :keyboard: Запуск автотестов

***Локальный запуск тестов:***

```
gradle clean test -Denv=local
```

***Удаленный запуск тестов:***

```
gradle clean test -Denv=remote
```
***Запуск тестов с переопределенными параметрами***
```
gradle clean ${TASK} -Dbrowser="${BROWSER}" -DbrowserVersion="${VERSION}" -DbrowserSize="${SIZE}" -Denv="${ENVIRONMENT}" 
```
###
* <code>TASK</code> (набор тестов для запуска)
* <code>BROWSER</code> – браузер, в котором будут выполняться тесты.
* <code>SIZE</code> – размер окна браузера, в котором будут выполняться тесты.
* <code>VERSION</code> – версия браузера, в которой будут выполняться тесты. 
* <code>ENVIRONMENT</code> – окружение, на котором будут запускаться тесты.
____
<a id="jenkins"></a>

## <img alt="Jenkins" height="25" src="media/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/igafarov_amk_ui_autotests/)</a>

<p align="center">  
<a href="https://jenkins.autotests.cloud/job/igafarov_amk_ui_autotests/"><img src="media/screenshots/jenkins.jpg" alt="Jenkins"/></a>  
</p>

## <img alt="Jenkins" height="25" src="media/logo/Jenkins.svg" width="25"/></a><a name="Параметры сборки"></a>Параметры сборки в [Jenkins](https://jenkins.autotests.cloud/job/igafarov_amk_ui_autotests/)</a>
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/igafarov_amk_ui_autotests/"><img src="media/screenshots/build_parameters.jpg" alt="Jenkins"/></a>  
</p>

<a id="allure"></a>

## <img src="media/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Allure <a target="_blank" href="https://jenkins.autotests.cloud/job/igafarov_amk_ui_autotests/allure/">отчёт</a>

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="media/screenshots/allure.jpg">  
</p> 

<a id="allure-testops"></a>

## <img src="media/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/4089/dashboards">Allure TestOps</a>

### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="media/screenshots/testOps.jpg">  
</p> 

<a id="jira"></a>

## <img src="media/logo/Jira.svg" width="25" height="25"  alt="Allure"/></a>Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-1137">Jira</a>

<p align="center">  
<img title="Jira" src="media/screenshots/jira.jpg">  
</p>

<a id="telegram"></a>

## <img src="media/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a>Уведомление в Telegram

<p align="center">  
<img title="Allure Overview Dashboard" src="media/screenshots/notificationTg.jpg">  
</p>

<a id="video"></a>

## <img src="media/logo/Selenoid.svg" width="25" height="25"  alt="Selenoid"/></a> Примеры видео выполнения тестов на Selenoid

<p align="center"> 
<img title="Selenoid Video" src="media/video/video.gif" width="690" height="388"  alt="video">  

[Наверх ⬆](#наверх)