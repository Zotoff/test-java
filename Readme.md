# Обучающий проект мега-разработчиков Java от Axenix

## Как создать новый проект через IntelliJ из уже существующего репозитория на github
- зарегистрироваться на github https://github.com, если еще нет аккаунта
- открыть IntelliJ
- File -> New -> Project from version control
- вставить в поле с репозиторием ссылку https://github.com/Zotoff/test-java.git
- выбрать, где будет находиться папка с проектом на компе (второе поле в окне создания проекта)
- продолжить создание проекта

## Как работать с проектом в IntelliJ
- работа над своим проектом не ведется в ветке main. Надо создать ветку со своим ником из github. Сделать это можно в IntelliJ
- новая ветка создается в окне Git в IntelliJ после создания проекта. Чтобы создать свою ветку, надо перейти во вкладку Git в левом нижнем углу экрана, выбрать ветку main левым кликом и нажать клавишу +, чтобы создать свою ветку от текущего состояния main
- правый клик в том же окне на своей ветке и клик на Checkout в появившемся контекстном меню
- после создания ветки работать над проектом

## Как коммитить через IntelliJ
- !!!проверяем, что работаем в своей ветке!!!
- в левом верхнем углу IntelliJ переходим на вкладку Commit
- ставим галки на файлах, которые хотим закоммитить
- жмем кнопку commit and push
- при необходимости авторизуемся на гитхабе, система сама об этом скажет
- проверяем, выскочило ли уведомление о том, что данные закоммичены и запушены

## Как пригрузить изменения с репозитория, если не создаем новый проект
- открываем IntelliJ
- переходим на вкладку Git внизу
- выбираем свою ветку
- жмем на синюю стрелочку Update selected

# Немного о работе в терминале, если кому понадобится

## Как закоммитить в терминале
- проверяем, установлен ли Git на компе, если нет - ставим с сайта https://git-scm.com
- открываем свой проект в IntelliJ
- открываем терминал Git Bash или переходим на вкладку Terminal в IntelliJ
- проверяем, в какой ветке находимся командой **git status**, **разработка должна вестись в ветке разработчика, а не в main**
- при необходимости переключаемся в свою ветку командой **git checkout -b branch_name**, где branch_name - имя ветки разработчика
- вбиваем команды из списка ниже, после каждой жмем Enter
```bash
git add . # так мы добавляем все неизмененные файлы
git commit -m "Commit name" # так коммитим, в кавычках - имя своего коммита
git push # а вот так пушим изменения
```

## Как пригрузить изменения через терминал
- открываем проект
- открываем вкладку Terminal в IntelliJ
- проверяем, в какой ветке находимся командой **git status**, **разработка должна вестись в ветке разработчика, а не в main**
- при необходимости переключаемся в свою ветку командой **git checkout -b branch_name**, где branch_name - имя ветки разработчика
- вбиваем команды из списка ниже
```bash
git pull
```