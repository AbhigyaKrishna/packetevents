/*
 * This file is part of packetevents - https://github.com/retrooper/packetevents
 * Copyright (C) 2022 retrooper and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.retrooper.packetevents.protocol.packettype.clientbound;

public enum ClientboundPacketType_1_19_3 {
    SPAWN_ENTITY,
    SPAWN_EXPERIENCE_ORB,

    //Removed in 1.19
    //SPAWN_LIVING_ENTITY,
    //SPAWN_PAINTING,

    SPAWN_PLAYER,

    //Removed in 1.19
    //SCULK_VIBRATION_SIGNAL,

    ENTITY_ANIMATION,
    STATISTICS,
    //Removed in 1.19 and replaced with ACKNOWLEDGE_BLOCK_CHANGES
    //ACKNOWLEDGE_PLAYER_DIGGING,

    //Added in 1.19
    ACKNOWLEDGE_BLOCK_CHANGES,

    BLOCK_BREAK_ANIMATION,
    BLOCK_ENTITY_DATA,
    BLOCK_ACTION,
    BLOCK_CHANGE,
    BOSS_BAR,
    SERVER_DIFFICULTY,

    //Removed in 1.19.3
    //CHAT_PREVIEW_PACKET,

    CLEAR_TITLES,
    TAB_COMPLETE,
    DECLARE_COMMANDS,
    CLOSE_WINDOW,
    WINDOW_ITEMS,
    WINDOW_PROPERTY,
    SET_SLOT,
    SET_COOLDOWN,

    //Added in 1.19.1
    CUSTOM_CHAT_COMPLETIONS,

    PLUGIN_MESSAGE,

    //Removed in 1.19.3
    //NAMED_SOUND_EFFECT,

    //Added in 1.19.1
    DELETE_CHAT,

    DISCONNECT,

    //Added in 1.19.3
    DISGUISED_CHAT,

    ENTITY_STATUS,
    EXPLOSION,
    UNLOAD_CHUNK,
    CHANGE_GAME_STATE,
    OPEN_HORSE_WINDOW,
    INITIALIZE_WORLD_BORDER,
    KEEP_ALIVE,
    //This is also used for lighting
    CHUNK_DATA,
    EFFECT,
    PARTICLE,
    UPDATE_LIGHT,
    JOIN_GAME,
    MAP_DATA,
    MERCHANT_OFFERS,
    ENTITY_RELATIVE_MOVE,
    ENTITY_RELATIVE_MOVE_AND_ROTATION,
    ENTITY_ROTATION,
    VEHICLE_MOVE,
    OPEN_BOOK,
    OPEN_WINDOW,
    OPEN_SIGN_EDITOR,
    PING,
    CRAFT_RECIPE_RESPONSE,
    PLAYER_ABILITIES,

    //Removed in 1.19.3
    //PLAYER_CHAT_HEADER,

    //Interesting changes in 1.19. This is used by vanilla to broadcast messages sent by clients to all connected clients.
    CHAT_MESSAGE,

    END_COMBAT_EVENT,
    ENTER_COMBAT_EVENT,
    DEATH_COMBAT_EVENT,

    //Removed in 1.19.3 and replaced with PLAYER_INFO_REMOVE and PLAYER_INFO_UPDATE
    //PLAYER_INFO,

    //Added in 1.19.3 (read comment above)
    PLAYER_INFO_REMOVE,
    PLAYER_INFO_UPDATE,

    FACE_PLAYER,
    PLAYER_POSITION_AND_LOOK,
    UNLOCK_RECIPES,

    DESTROY_ENTITIES,

    REMOVE_ENTITY_EFFECT,
    RESOURCE_PACK_SEND,
    RESPAWN,
    ENTITY_HEAD_LOOK,
    MULTI_BLOCK_CHANGE,
    SELECT_ADVANCEMENTS_TAB,

    //Added in 1.19. Seems like cancelling it surpresses the warning of messages not being verified on the client.
    SERVER_DATA,

    ACTION_BAR,
    WORLD_BORDER_CENTER,
    WORLD_BORDER_LERP_SIZE,
    WORLD_BORDER_SIZE,
    WORLD_BORDER_WARNING_DELAY,
    WORLD_BORDER_WARNING_REACH,
    CAMERA,
    HELD_ITEM_CHANGE,
    UPDATE_VIEW_POSITION,
    UPDATE_VIEW_DISTANCE,
    SPAWN_POSITION,

    //Deleted in 1.19.3
    //DISPLAY_CHAT_PREVIEW,

    DISPLAY_SCOREBOARD,
    ENTITY_METADATA,
    ATTACH_ENTITY,
    ENTITY_VELOCITY,
    ENTITY_EQUIPMENT,
    SET_EXPERIENCE,
    UPDATE_HEALTH,
    SCOREBOARD_OBJECTIVE,
    SET_PASSENGERS,
    TEAMS,
    UPDATE_SCORE,
    UPDATE_SIMULATION_DISTANCE,
    SET_TITLE_SUBTITLE,
    TIME_UPDATE,
    SET_TITLE_TEXT,
    SET_TITLE_TIMES,
    ENTITY_SOUND_EFFECT,
    SOUND_EFFECT,
    STOP_SOUND,

    //Added in 1.19. This is now used only for system messages by vanilla.
    SYSTEM_CHAT_MESSAGE,

    PLAYER_LIST_HEADER_AND_FOOTER,
    NBT_QUERY_RESPONSE,
    COLLECT_ITEM,
    ENTITY_TELEPORT,
    UPDATE_ADVANCEMENTS,
    UPDATE_ATTRIBUTES,

    //Added in 1.19.3
    UPDATE_ENABLED_FEATURES,

    ENTITY_EFFECT,
    DECLARE_RECIPES,
    TAGS
}
