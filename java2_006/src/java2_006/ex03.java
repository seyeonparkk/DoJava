package java2_006;

import java.awt.Toolkit;

class Ex03 {

public static void main(String[] args) {

PrintThread worker1 = new PrintThread('X');

worker1.start();

PrintThread worker2 = new PrintThread('.');

worker2.start();

BeepThread beep = new BeepThread(5, 1000);

beep.start();

for (int num = 0;num < 30;num++) {

//System.out.println(

}

}

}


class PrintThread extends Thread {

char ch;

PrintThread(char ch) {

//

this.ch = ch;

}

public void run() {

for (int num = 0;num < 30;num++) {

System.out.print(ch);

//

}

}

}

class BeepThread extends Thread {

int count;

int gap;

Toolkit tool = Toolkit.getDefaultToolkit();

BeepThread(int count, int gap) {

this.count = count;

this.gap = gap;

}

public void run() {

for (int num = 0;num < count;num++) {

tool.beep();

try { Thread.sleep(gap); } catch (InterruptedException e) { ; }

}

}

}
