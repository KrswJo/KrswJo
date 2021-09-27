public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
    }
}

// Terminal == 윈도우에서 쓰는 CMD

// git 명령어 인자
// git ==> 프로그램 (Git 이라는 프로그램을 킬꺼야)

// 명령어 ==>  해당 명령어를 해줘(push, pull, fetch, add, status)
// 명령어에 대한 예시) 시리야(git) 노래틀어(명령어)

// 인자 ==> 나는 명령어를 쓸 껀데 구체적으로 어떻게 쓸꺼야! ,
// 인자에 대한 예시) 햄버거집에 가서 얼음없는(인자) 콜라 주문할께요(명령어)

// 맨 처음에 깃을 사용할 때: git init
// init은 초기화, 처음 맨들꺼에요!
// IntelliJ VCS -> Create git Repository

// 버전관리를 하고 싶은 놈을 추가할 때:  git add 파일명이나 폴더명
// 이 놈 내가 관리할꺼에요.
// IntelliJ Git -> commit -> 버전관리할 파일들을 추가!

// 버전을 만들 때: git commit -m "내용"
// 버전 만든다잉!
// IntelliJ Git -> commit -> 버전관리할 파일들을 추가! -> Commit Message 내용을 입력 후 -> Commit 누르기

// 온라인에 올릴 때는 1.원격지를 지정한 후 -> 2. Push를 사용하여서 올립니다.


// 1. 원격지를 지정할 때는 git remote add 단축명 주소
// remote 원격지를 의미!
// add 원격지를 추가할꺼에요!
// 단축명은 123.565.565.123 -> 네이버처럼 가능하게 하는것(DNS 같은 놈)
// 주소는 아이피와 같은 놈
// IntelliJ Git push -> Define Remote 로 주소 추가

// 2. 원격지에 올려봅시다. git push 단축명 원격지의 브랜치
// 단축명은 아까 지정한 원격지의 단축명을 의미
// 원격지의 브랜치 : master는 대빵이니까 가급적이면 쓰지마세요.
// git push origin master
// IntelliJ Git push -> 주소지 지정 -> Push (밑에 보면 forced push)
