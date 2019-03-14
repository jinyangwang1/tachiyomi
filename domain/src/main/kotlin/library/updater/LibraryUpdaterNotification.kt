/*
 * Copyright (C) 2018 The Tachiyomi Open Source Project
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package tachiyomi.domain.library.updater

import tachiyomi.domain.library.model.LibraryManga

interface LibraryUpdaterNotification {

  fun showProgress(manga: LibraryManga, current: Int, total: Int)

  fun showResult(updates: List<LibraryManga>)

  fun start()

  fun end()

}
