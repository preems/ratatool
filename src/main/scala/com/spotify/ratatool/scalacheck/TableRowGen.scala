/*
 * Copyright 2016 Spotify AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.spotify.ratatool.scalacheck

import com.google.api.services.bigquery.model.{TableRow, TableSchema}
import com.spotify.ratatool.generators.TableRowGenerator
import org.scalacheck._

object TableRowGen {

  /** ScalaCheck generator of BigQuery [[TableRow]] records. */
  def tableRowOf(schema: TableSchema): Gen[TableRow] =
    Gen.const(0).map(_ => TableRowGenerator.tableRowOf(schema))

}
