# 简单计时器 Stopwatch

避免自己写`System.currentTimeMillis()`。

# 源码阅读

比较简单，启动和停止的时候记录当时的系统纳秒值。

```java
  public Stopwatch start() {
    checkState(!isRunning, "This stopwatch is already running.");
    isRunning = true;
    startTick = ticker.read();
    return this;
  }


  public Stopwatch stop() {
    long tick = ticker.read();
    checkState(isRunning, "This stopwatch is already stopped.");
    isRunning = false;
    elapsedNanos += tick - startTick;
    return this;
  }
```

```java
private static final Ticker SYSTEM_TICKER =
      new Ticker() {
        @Override
        public long read() {
          return Platform.systemNanoTime();
        }
      };
```