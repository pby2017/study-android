```
1. RecyclerView에 대해서 조사하고, RecyclerView의 주요 클래스를 모두 구현한 코드를 작성하시오. (주요 클래스 Adapter, ViewHolder, LayoutManager, ItemDecoration, ItemAnimator)
`https://developer.android.com/guide/topics/ui/layout/recyclerview`

2. REST API에 대해서 조사하시오.
`https://en.wikipedia.org/wiki/Representational_state_transfer`
`https://spoqa.github.io/2012/02/27/rest-introduction.html`
`https://meetup.toast.com/posts/92`

3. 다음과 같은 디자인을 갖는 나만의 Custom Notification Class를 작성하시오.
(Activity의 어떠한 상태가 변경되면 해당 알림에도 상태가 변경되게 할 것 ex) 테스트 환경 'DEV' -> 테스트 환경 'Staging', 해당 알림을 클릭하거나 드래그했을 때 알림이 사라지지 않게 할 것, 해당 알림을 강제로 사라지게 만드는 버튼이 있을 것, Notification channel이 있을 것)
`https://developer.android.com/training/notify-user/custom-notification`
```
# Create a Custom Notification Layout
## NotificationManager
* notification channel, channel group의 생성과 삭제 등의 관리 역할을 합니다.
* 알림의 importance 값을 제공합니다.
* 알림을 생성하거나 현재 보여지는 알림을 취소할 수 있습니다.
# Create and Manage Notification Channels
* Android 8.0 (API level 26) 버전 이상부터 모든 notification들은 channel에 할당되어야 합니다.
## notification channel 생성하기
* 생성 방법
  * ```NotificationChannel``` 객체를 생성합니다.
  * ```setDescription()``` 메서드를 호출하여 선택사항으로 시스템 설정에서 유저에게 보여질 설명을 정의합니다.
  * ```createNotificationChannel()``` 메서드의 인자로 ```NotificationChannel``` 객체를 인자로 전달해서 notification을 등록합니다.
* 중복된 채널을 생성할 경우 동작하지 않습니다.
  * 앱이 시작할 때 호출해도 안전합니다.
* 기본적으로 모든 notification들은 ```IMPORTANCE_DEFAULT```와 ```MPORTANCE_HIGH```와 같은 ```NotificationManagerCompat``` 클래스의 importance level에 따라 각, 청각적 동작을 수행합니다.
* ```enableLights()```, ```setLightColor()``` 등의 메서드를 호출해서 notification 의 동작을 커스터마이징할 수 있습니다.
* ```createNotificationChannels()``` 메서드 한 번의 호출로 여러 notification channel들을 생성할 수 있습니다.
* ```NotificationChannel``` 생성자 안에서 channel의 importance level을 정의해야 합니다.
### importance level 설정하기
* importance level은 ```IMPORTANCE_NONE (0)``` 부터 ```IMPORTANCE_HIGH (4)```까지 5종류가 있습니다.
  * (Android 8.0 and higher / Android 7.1 and lower)
    * Urgent : 소리를 내고 알림 메시지를 status bar에 표시하며 헤드업 알림을 표시합니다.
      * (IMPORTANCE_HIGH / PRIORITY_HIGH 또는 PRIORITY_MAX)
      * 헤드업 알림 : 상단에 전화왔을 때와 같이 사용자가 조치를 취할 수 있는 알림 창을 표시합니다.
    * High : 소리를 내고 알림 메시지를 status bar에 표시합니다.
      * (IMPORTANCE_DEFAULT / PRIORITY_DEFAULT)
    * Medium : 소리없이 알림 메시지를 status bar에 표시합니다.
      * (IMPORTANCE_LOW / PRIORITY_LOW)
    * Low : 소리가 없고 알림 메시지를 status bar에 표시하지도 않습니다.
      * (IMPORTANCE_MIN / PRIORITY_MIN)
* Channel에 적용한 importance level은 channel 안의 모든 notification에 적용됩니다.
* Android 7.1 (API level 25) 이하 버전의 안드로이드 기기에서 importance level을 설정하려면 ```NotificationCompat``` 클래스의 ```setPriority()``` 메서드를 호출해야 합니다.
* ```NotificationManager```로 channel을 보낸 뒤로부터 importance level을 변경할 수 없지만, 사용자는 언제든지 바꿀 수 있습니다.
## notification channel 설정값 읽기
* 사용자는 notification channel의 설정을 바꿀 수 있기 때문에 유저의 선택으로부터 설정값을 읽어오려면 다음과 같이 하면 됩니다.
  * ```getNotificationChannel()``` 나 ```getNotificationChannels()``` 메서드를 호출해서 ```NotificationChannel``` 객체를 불러옵니다.
  * ```getVibrationPattern()``` 등의 메소드 호출로 사용자의 설정값을 불러옵니다. 
## notification channel 열기
* notification channel을 생성한 뒤에는 프로그래밍으로 시각, 청각적 동작을 바꿀 수 없고 사용자가 시스템 설정에서 바꿔야 합니다. 따라서 사용자가 시스템 설정에 쉽게 접근할 수 있도록 앱 안에서 시스템 설정 UI를 제공해야 합니다.
* ```ACTION_CHANNEL_NOTIFICATION_SETTINGS``` action을 사용한 Intent를 통해서 notification channel을 위한 시스템 설정을 열 수 있습니다.
  * 이때 package명과 channel id 값을 extra data로 전달해야 합니다.
## notification channel 제거하기
* channel id 파라미터와 함께 ```deleteNotificationChannel()``` 메서드를 호출해서 notification channel을 제거할 수 있습니다.
## notification channel group 만들기
* 예시를 들면 직장, 개인 등으로 따로 계정을 사용할 때 그룹을 지정해서 notification channel을 관리할 수 있습니다.
* Package 내에서 유일한 group id와 group name을 파라미터로 전달하여 ```NotificationChannelGroup``` 객체를 생성합니다.
* ```createNotificationChannelGroup()``` 메서드를 호출해서 group을 생성합니다.
* group을 생성하고 ```setGroup()``` 메서드를 호출해서 group과 새로운 ```NotificationChannel``` 객체를 연결할 수 있습니다.
* notification manager에 notification channel을 보낸 뒤로부터 notification channel과 group 간의 관계를 바꿀 수 없습니다.
# Intent, PendingIntent
* 인텐트
  * 다른 앱 구성 요소(액티비티, 서비스 등)에게 작업을 요청하고 값을 전달할 수 있는 메시지 객체입니다.
* 인텐트 플래그
  * 액티비티 스택의 순서를 관리함
  * 펜딩 인텐트
  * FLAG_ACTIVITY_CLEAR_TOP : 실행할 액티비티의 상위 액티비티들을 삭제
  * FLAG_ACTIVITY_FORWARD_RESULT : 새 액티비티를 실행하고 호출한 액티비티에게 결과값을 반환
  * FLAG_ACTIVITY_REORDER_TO_FRONT : 실행할 액티비티를 history stack의 최상위로 올려주지만, FLAG_ACTIVITY_CLEAR_TOP 플래그가 있으면 FLAG_ACTIVITY_REORDER_TO_FRONT는 무시됨
  * FLAG_ACTIVITY_SINGLE_TOP : 실행할 액티비티가 history stack 최상위에 있으면, 액티비티는 실행되지 않음
* 펜딩 인텐트
  * 작업을 위임하는 역할
* 펜딩 인텐트 플래그
  * FLAG_CANCEL_CURRENT : 기존 펜딩 인텐트를 먼저 취소하고 새 펜딩 인텐트를 생성합니다.
  * FLAG_UPDATE_CURRENT : 기존의 펜딩 인텐트는 유지하지만 extra data는 새 인텐트의 것으로 대체함
  * FLAG_ONE_SHOT : 펜딩 인텐트가 한 번만 사용될 수 있게 하며, send가 호출되면 이후 자동으로 취소됨
  * FLAG_NO_CREATE : 펜딩 인텐트가 없으면 생성하지 않고 null을 반환함
# 참고
* [developer.android.com/reference - notification channel](https://developer.android.com/reference/android/app/NotificationChannel.html)
* [developer.android.com/reference - notification DecoratedCustomViewStyle](https://developer.android.com/reference/androidx/core/app/NotificationCompat.DecoratedCustomViewStyle.html)
* [developer.android.com/guide - notification](https://developer.android.com/guide/topics/ui/notifiers/notifications)
* [developer.android.com/guide - intent](https://developer.android.com/guide/components/intents-filters?hl=ko)
* [developer.android.com/training - create notification](https://developer.android.com/training/notify-user/build-notification.html)
* [developer.android.com/training - custom notification](https://developer.android.com/training/notify-user/custom-notification)
* [developer.android.com/training - channels](https://developer.android.com/training/notify-user/channels)
* [developer.android.com/training - expanded notification](https://developer.android.com/training/notify-user/expanded.html)
* [github googlesamples - android notifications](https://github.com/googlesamples/android-Notifications)
* [pendingIntent란](https://techlog.gurucat.net/80)
* []


// 구현.
// 앞부분에 힘을 많이 사용한 것 같다.
// 적당히 골고루 조사
// 스케줄 = 약속 = 잘해야함.
// animate,, = 기본 애니메이션.
// listView = 애니메이션 (리소스 많이 먹는 작업) 잘 사용 안하기도 함.
// 과제의 의도에 맞게 핵심. (흥미 위주x = 퀄리티x, 부가적인 부분은 뒤로)
// recyclerView, widget 사용법, adapter 패턴 배우는 점.
// 추가과제 많이 내줬었는데, 하고 싶은걸 혹은 이야기 많이 나왔던걸, 스스로 정해서 하시면 될 것 같아요.
// 