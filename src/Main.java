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

// 평행우주가 얼마나 있는지 확인해보기 git branch
// IntelliJ Git -> Branches

// 평행 우주 만들기 git branch 새로운 브랜치명
// IntelliJ Git -> Branches -> Create New Branch (해당 브랜치를 만들고 난 후 바로 이동하기)

// 나 돌아갈래 ! git checkout 브랜치명
// IntelliJ Git -> Branches -> 해당 브랜치 -> Checkout

// 평행우주 지우기 git branch -d 브랜치명
//  IntelliJ Git -> Branches -> 해당 브랜치 -> Delete

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

// 3. 웹 사이트 버전 = 내 컴퓨터의 버전을 동기화할 때 사용한다. git pull 단축명 원격지의 브랜치
// 단축명은 아까 지정한 원격지의 단축명을 의미
// 원격지의 브랜치 : master는 대빵이니까 가급적이면 쓰지마세요.
// IntelliJ Git pull -> 주소지 지정 -> Pull

// 3-1 업데이트 해야할 내용이 있는 없는지 알아볼 때 쓰는 명령어 git fetch 단축명 원격지 브랜치
// IntelliJ Git Fetch

// 다른 브랜치(로컬에서 작업한 브랜치 또는 협업할 때 사용하는 브랜치)와 문제가 없어서 결합할 때 사용하는 명령어
// merge , Rebase
// merge : 기존의 잔가지들은 남겨두고 하는 방식
// rebase : 나머지 잔가지 그냥 무시해!

// 어떤 차이점이 발생했는지 알기 위해서 사용하는 명령어 : git log
// IntelliJ Git -> Show Git Log -> 변화가 있는 파일들을 알아볼 때 사용

// Create Pull Request
// 일반적으로 다른 사람들과 협업을 하는데, 그중에서 Master 브랜치에 함부로 Merge 할 수 없도록 막아놓는다.
// Pull Request -> 나 이 코드 올릴 건데, 당신들이 확인 좀 해줘라!

// 내 로컬디스크에 가져올꺼야! git clone 대상링크 저장할폴더
// IntelliJ Git -> Clone -> 가져올 링크의 주소와, 저장할 디렉토리명

// 남의 소스코드를 내 원격지로 끌고 명령어! git fork
// 오픈소스 기여할 때 주로 사용한다고 생각