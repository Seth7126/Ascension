// 函数: _ZN14ascensionrules13TransformCardEPN9ascension6CWorldEPNS0_7CPlayerEPN4core13CCardInstanceEPKcb
// 地址: 0x1136d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer::RemoveOwnedCard(arg2)
ascension::CPlayer::AddTurnLog(arg2, 0xb)
ascension::CWorld::SetPlayedCardsFlags(arg1, arg3)
void* r0_4 = ascension::CDatabase::GetCard(ascension::g_Database)
uint32_t result = ascension::CWorld::CreateCard(arg1)

if (result == 0)
    return result

int32_t* i = *(r0_4 + 0x130)

while (i != *(r0_4 + 0x134))
    core::CInstance* r1_4 = *i
    i = &i[1]
    ascension::CWorld::AddGlobalActiveEffect(arg1, r1_4)

ascension::CPlayer::AddOwnedCard(arg2)
uint32_t var_38_1 = zx.d(*(result + 8))
ascension::CWorld::OutputEvent(arg1, 0xf, zx.d(*(arg2 + 8)), zx.d(*(arg3 + 8)))
uint32_t var_34_1
uint32_t var_30_1

if (arg5.d == 0)
    ascension::CPlayer::PutCardInHand(arg2)
    int32_t var_38_3 = 0
    var_34_1 = 1
    var_30_1 = zx.d(*(arg2 + 8))
    int32_t var_2c_2 = 0
    int32_t var_28_2 = 0
else
    int32_t var_38_2 = 0
    var_34_1 = 4
    var_30_1 = zx.d(*(ascension::CPlayer::PutConstructInPlay(arg2, result.b) + 8))
    int32_t var_2c_1 = 0
    int32_t var_28_1 = 0

return ascension::CWorld::OutputAnimationCard(arg1, result, 0, 0xb, 0, var_34_1, var_30_1, 0)
