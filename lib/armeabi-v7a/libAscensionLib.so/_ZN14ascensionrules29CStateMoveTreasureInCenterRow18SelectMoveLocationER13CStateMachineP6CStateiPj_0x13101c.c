// 函数: _ZN14ascensionrules29CStateMoveTreasureInCenterRow18SelectMoveLocationER13CStateMachineP6CStateiPj
// 地址: 0x13101c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = *(arg2 + 0x254)

if (r5 == 0)
    return 

core::CCardInstance* r1 = *(arg2 + 0x258)

if (r1 s< 0)
    return 

void* r8_1 = *(arg2 + 0x24c)
core::CCardInstance* r6_1 = *(r8_1 + 4)

if (ascension::CWorld::RemoveCenterRowCard(r6_1, r1) == 0)
    return 

ascension::CWorld::PutCardUnderCenterRow(r6_1, arg3, r5)
int32_t var_28_1 = 0
ascension::CWorld::OutputAnimationCard(r6_1, r5, 1, 7, *(arg2 + 0x258), 7, arg3, 0)
ascension::CWorld::OutputPauseForAllAnimation()
int32_t var_38_2 = 0
ascension::CWorld::OutputEvent(r6_1, 0x13, zx.d(*(r8_1 + 8)), zx.d(*(r5 + 8)))
*(arg2 + 0x250) = 1
