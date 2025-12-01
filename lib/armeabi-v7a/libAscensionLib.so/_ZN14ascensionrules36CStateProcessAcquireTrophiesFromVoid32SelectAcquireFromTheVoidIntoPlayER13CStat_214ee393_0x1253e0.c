// 函数: _ZN14ascensionrules36CStateProcessAcquireTrophiesFromVoid32SelectAcquireFromTheVoidIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x1253e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

core::CCardInstance* r7_1 = *(arg2 + 0x24c)
core::CCardInstance* r6_1 = *(r7_1 + 4)

if (ascension::CWorld::RemoveCardFromVoid(r6_1) == 0)
    return 

int32_t var_28_1 = 0
ascension::CWorld::OutputAnimationCard(r6_1, arg3, 4, 9, 0, 5, 
    zx.d(*(ascension::CPlayer::PutTrophyInPlay(r7_1) + 8)), 0)
int32_t var_38_1 = 0
ascension::CWorld::OutputEvent(r6_1, 4, zx.d(*(r7_1 + 8)), zx.d(*(arg3 + 8)))
*(arg2 + 0x254) += 1
