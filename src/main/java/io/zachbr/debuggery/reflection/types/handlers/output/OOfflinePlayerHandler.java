/*
 * This file is part of Debuggery.
 *
 * Debuggery is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Debuggery is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Debuggery.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.zachbr.debuggery.reflection.types.handlers.output;

import io.zachbr.debuggery.reflection.types.handlers.base.OHandler;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class OOfflinePlayerHandler implements OHandler {

    @Nullable
    @Override
    public String getFormattedOutput(Object object) {
        final OfflinePlayer player = (OfflinePlayer) object;

        if (player instanceof Player) {
            return player.toString();
        } else {
            return "[" + player.getName() + ":" + player.getUniqueId() + "]";
        }
    }

    @NotNull
    @Override
    public Class<?> getRelevantClass() {
        return OfflinePlayer.class;
    }
}
