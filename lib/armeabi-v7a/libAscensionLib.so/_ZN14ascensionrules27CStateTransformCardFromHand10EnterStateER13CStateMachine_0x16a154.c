// 函数: _ZN14ascensionrules27CStateTransformCardFromHand10EnterStateER13CStateMachine
// 地址: 0x16a154
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r0 = *(arg1 + 0x38)
core::CCardInstance* r5 = *(r0 + 4)
int32_t var_20 = 0
ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x3c), 1, 1, zx.d(*(r0 + 8)), 0xb, 0, 0)
*(arg1 + 0x3c)
ascension::CPlayer::RemoveCardFromHand(*(arg1 + 0x38))
ascension::CWorld::PushResolveEffect(r5, *(arg1 + 0x3c))
core::CInstance* r3 = *(arg1 + 0x3c)
void* result = *(r3 + 0xc)
ascension::CEffect* r2_1 = *(result + 0xfc)

if (r2_1 == 0)
    return result

ascensionrules::CreateStateProcessCardEffect(r5, *(arg1 + 0x38), r2_1, r3, nullptr, nullptr, 0)
CState* entry_r1
return CStateMachine::PushOwnedState(entry_r1) __tailcall
