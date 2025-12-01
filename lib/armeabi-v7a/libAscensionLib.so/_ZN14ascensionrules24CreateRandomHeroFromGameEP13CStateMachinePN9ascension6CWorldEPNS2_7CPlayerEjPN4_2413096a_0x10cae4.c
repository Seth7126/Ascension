// 函数: _ZN14ascensionrules24CreateRandomHeroFromGameEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10cae4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (zx.d(*(arg2 + 0xa14)) != 0)
    return ascension::CPlayer::AddPendingDraw() __tailcall

int32_t r4 = (*(arg2 + 0xad8) - *(arg2 + 0xad4)) s>> 2
int32_t r0_8

if (*(arg2 + 0x30) u> 0xa)
    r0_8 = (*(*arg2 + 0xc))(arg2, r4)
else
    r0_8 = __aeabi_uidivmod((*(*arg2 + 8))(arg2), r4)

void* r4_1 = *(*(arg2 + 0xad4) + (r0_8 << 2))
core::CCardInstance* r0_12 = ascension::CWorld::CreateCard(arg2)

if (*(arg2 + 0x30) u>= 0xb)
    core::CInstance** i = *(r4_1 + 0x130)
    
    while (i != *(r4_1 + 0x134))
        core::CInstance* r1_8 = *i
        i = &i[1]
        ascension::CWorld::AddGlobalActiveEffect(arg2, r1_8)

ascensionrules::CreateStateProcessAcquireCardSequence(arg3, r0_12, 8, 0, 1, nullptr, 0)
return CStateMachine::PushListState(arg1) __tailcall
