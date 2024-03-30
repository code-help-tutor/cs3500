WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package cs3500.hw01.ebooks;

import java.util.Objects;

public class TextFlow implements EBookFlow {
  private final String content;

  public TextFlow(String content) {
    this.content = Objects.requireNonNull(content);
    if (content.contains("\n")) {
      throw new IllegalArgumentException("Text flows cannot contain line breaks");
    }
  }

  public int countWords() {
    return this.content.split(" ").length;
  }

  public boolean contains(String word) {
    return this.content.contains(word);
  }
}
