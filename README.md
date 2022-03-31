# FamousSaying_View_Andriod
랜덤한 명언을 보여주는 간단 안드로이드 어플
ListView를 위한 study app

3월 31일 study: Element :ListView, 커스텀폰트, onBackPressed()...etc

    리스트뷰: sentence xml에서 리스트뷰만들고 adpater만든뒤 그걸로item xml에 연결하고 item을 다시 sentence xml에 연결
    1.sentence xml에서 listview생성
    2. adapter class생성 후  ListViewAdapter(val List : MutableList<String>) : BaseAdapter()한뒤 4개의 함수들 override해줌
        getCount: 리스트뷰의 아이템갯수 return List.size
        getItem- return List[p0],  getItemId- return p0.toLong()    : 이 두함수는 크게 신경 안써도 된다.	
        getView : 데이터를 받아와서 아이템에 있는것들을 하나하나 넣어주는 함수, 아이템이 있는 xml함수가 필요함 ->item xml생성
        xml내에 TextView 생성  //이제 이렇게 만들어진 item을 getView로 가져온다.
        var convertView = p1
        if(converView ==null){ converView =LayoutInflater.from(p2?.context).inflate(R.layout.만든item xml,p2,false)}로 xml파일 연결
        val title = converView!!.findViewById<TextView>(R.id. item xml에서만든textview) 
        title.text = List[p0]로 하나하나 내용을 넣어준다.
        return converView
    3. sentenceActivity에서 list만들고 내용add 해준다. adapter를 만들어주고 list를 adapter에 넣어준다.
    4. sentence xml에서 만든 listview를 findViewById로 가져와준뒤  .adapter로 만든adapter를 넣어준다.
    //물론 list말고 listviewmodel을 받을수도있다는데 model을 쓰는이유는 잘모르겠다.
    
    커스텀폰트-> 다운로드한뒤 res에 font폴더 생성후 집어넣기
    
    뒤로가기 이벤트 : override fun onBackPressed()로 뒤로가기 버튼을 눌렀을 경우 처리하는 함수를 부를수있다.
    handler의 postDelayed를 이용하여 두번눌렀을때 finish()를 불러 앱종료 기능 구현 가능
    
    constraintlayout에서는 위치를 정확하게 써줘야하는듯하다.
