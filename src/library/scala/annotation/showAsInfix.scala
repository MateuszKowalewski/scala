/*
 * Scala (https://www.scala-lang.org)
 *
 * Copyright EPFL and Lightbend, Inc.
 *
 * Licensed under Apache License 2.0
 * (http://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package scala.annotation

/**
 * This annotation configures how Scala prints two-parameter generic types.
  *
  * By default, types with symbolic names are printed infix; while types without
  * them are printed using the regular generic type syntax.
  *
  * Example of usage:
  {{{
    scala> class Map[T, U]
    defined class Map

    scala> def foo: Int Map Int = ???
    foo: Map[Int,Int]

    scala> @showAsInfix class Map[T, U]
    defined class Map

    scala> def foo: Int Map Int = ???
    foo: Int Map Int
  }}}
  *
  * @param enabled whether to show this type as an infix type operator.
  * @since 2.12.2
  */
final class showAsInfix(enabled: Boolean = true) extends annotation.StaticAnnotation
