// 函数: _ZN14ascensionrules22CStateMustPayResources9SelectPayER13CStateMachineP6CStateiPj
// 地址: 0x152348
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = *(arg2 + 0x24c)

if (arg4 != 0)
    arg1 = *arg4

int32_t r6 = *(r5 + 4)

if (arg4 == 0)
    arg1 = nullptr

void* r1 = arg1 & 0xff

if (r1 s> *(r6 + 0xb40))
    return 

void* r7_1 = arg1 u>> 8 & 0xff

if (r7_1 s> *(r6 + 0xb48))
    return 

int32_t r8_1 = arg1 u>> 0x10 & 0xff

if (r8_1 s> *(r5 + 0x8c) || r7_1 + r1 + r8_1 != *(arg2 + 0x58) + *(arg2 + 0x254) + *(arg2 + 0x5c))
    return 

if (r1 != 0)
    ascension::CWorld::RemoveCurrentTurnRunes(r6)

if (r7_1 != 0)
    ascension::CWorld::RemoveCurrentTurnPower(r6)

if (r8_1 != 0)
    ascension::CPlayer::RemoveInsightCount(r5)

*(arg2 + 0x26c) = 1
