// 函数: _ZN14ascensionrules39CStateProcessTakeRandomCardFromOpponent10EnterStateER13CStateMachine
// 地址: 0x14a33c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = *(*(arg1 + 0x34) + 0x3c)
int32_t r1 = *(result + 0x18)

if (r1 s< 1)
    return result

int32_t* r5_1 = *(*(arg1 + 0x30) + 4)
int32_t r0_4 = (*(*r5_1 + 0xc))(r5_1, r1)
void* r1_1 = *(arg1 + 0x34)
int32_t* r2_3 = *(*(r1_1 + 0x3c) + 0xc)

if (r0_4 s>= 1)
    int32_t r3_1 = not.d(r0_4)
    
    if (r3_1 s<= 0xfffffffe)
        r3_1 = 0xfffffffe
    
    r2_3 = &r2_3[r0_4 + r3_1 + 2]

uint32_t r6_1 = *r2_3
uint32_t r1_2 = zx.d(*(r1_1 + 8))
uint32_t var_20_1 = r1_2
ascension::CWorld::OutputAnimationCard(r5_1, r6_1, 8, 1, r1_2, 1, zx.d(*(*(arg1 + 0x30) + 8)), 3)
ascension::CPlayer::RemoveCardFromHand(*(arg1 + 0x34))
ascension::CPlayer::RemoveOwnedCard(*(arg1 + 0x34))
ascension::CPlayer::PutCardInHand(*(arg1 + 0x30))
ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 8)
return core::CWorldBase::OutputMessageFormat(r5_1, "%s takes %s from %s\n", *(arg1 + 0x30) + 0x10, 
    (*(*r6_1 + 0xc))(r6_1), *(arg1 + 0x34) + 0x10)
