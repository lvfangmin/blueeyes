package blueeyes.util

trait Future[+T] {
  def map[S](f: T => S): Future[T]
  
  def flatten[S](implicit witness: T => Future[S]): Future[S]
  
  def flatMap[S](f: T => Future[S]): Future[S] 
  
  def filter(f: T => Boolean): Future[T]
  
  def foreach(f: T => Unit): Unit
}