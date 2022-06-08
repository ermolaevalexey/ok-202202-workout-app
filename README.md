# ok-202202-workout-app

Выпускной проект курса [Otus Kotlin Backend developer](https://otus.ru/lessons/kotlin/?int_source=courses_catalog&int_term=programming).

Workout App -- это приложение, с помощью которого можно проводить тренировки в любом удобном месте, дома, в спортзале или на свежем воздухе.
Пользователям доступны различные программы функциональных тренировок от настоящих мастеров спорта.

Функциональные тренировки не требуют дорогостоящего оборудования или наличия абоненмента в фитнесс-клуб и позволяют привести себя в форму в разумные сроки.
Значительная часть тренировок оринтирована на использование собственного веса пользователя и для многих из них достаточно наличия гимнастического коврика, однако
в наличии есть и комплексы с гантелями или со скакалкой. Также они составлены с учетом современного ритма жизни человека, чтобы можно было не тратить время впустую.
Каждая тренировка займет не более получаса вашего времени, но эффект от нее не заставит себя ждать.

В процессе вы можете проработать различные группы мышц, а также улучшить свою выносливость, стать здоровее и избавиться от накопившегося стрессса.

Кроме того, программы распределены по уровням сложности, здесь можно подобрать комплекс как для тех, кто только решился улучшить свое тело, так и для уже
опытных спортсменов.

У пользователей есть возможность обратной связи с автором программы - перед началом курса сделать фото "до", а по окончании - фото "после" и оставить
поставить ей оценку, написать короткий отзыв. Для этого в каждой программе есть отдельный раздел с результатами.

## Учебный маркетинг приложения

Целевая аудитория сервиса -- молодые мужчины и женщины, со средним или выше среднего достатком (как семейные, так и нет).  
Их професии во многом основаны на сидячем образе жизни (офисные сотрудники различных специальностей).

### Гипотетический портрет пользователя

1. Мужчина или женщина со средним или выше среднего достатком, как правило, имеющий(я) высшее образование, специальность и семейное положение не имеет значения.
2. Возраст 25-35 лет.
3. Живет в городе-миллоннике или в столице региона.
4. Занят(а) офисной работой, малоподвижный стиль работы.
5. Вследствие малоподвижного образа жизни имеет же потребность в движении и физической активности.
6. Желает повысить свою внешнюю привлекатеьность для противоположного пола.


## Описание MVP

### Функции (эндпониты)
1. programs - программы тренировок
- read
- update - отметить выполненной
- delete удалить из выполненных
2. workouts - тренировка
- read
- update - отметить выполненной
3. feedback
- read
- create - отправить отзыв
- update - изменить отзыв, изменить оценку, добавить фото
- delete


### Описание сущности Workout
1. Title
2. Description
3. Equipment - оборудование для тренировки (enum)
- OwnWeight - собственный вес
- Dumbbells - гантели
- JumpingRope - скакалка
- HorizontalBar - турник
- Bars - брусья
5. Content
- video - видеоматериал тренировки
- steps - текстовое описание шагов тренировки
6. IsDone - выполнена/не выполнена

### Описание сущности Program
1. Title
2. Description
3. Difficulty - уровень сложности (enum)
- 1 - для начинающих
- 2 - средней сложности
- 3 - продвинутая
4. Equipment - оборудование для тренировки (List enum)
- OwnWeight - собственный вес
- Dumbbells - гантели
- JumpingRope - скакалка
- HorizontalBar - турник
- Bars - брусья
5. Workouts - сет из тренировок
6. IsStarted - начата/не начата
7. IsDone - выполнена/не выполнена
8. Progress - процент выполнения программы
9. Feedback - Отзывы пользователей
10. Rating - общая оценка программы от всех пользователей, кто пометил ее выполненной
















