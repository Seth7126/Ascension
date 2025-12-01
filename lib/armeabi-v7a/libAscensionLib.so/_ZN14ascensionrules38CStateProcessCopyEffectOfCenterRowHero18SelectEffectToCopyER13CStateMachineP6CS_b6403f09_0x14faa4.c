// 函数: _ZN14ascensionrules38CStateProcessCopyEffectOfCenterRowHero18SelectEffectToCopyER13CStateMachineP6CStateiPj
// 地址: 0x14faa4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r10 = *(arg2 + 0x24c)
char* r7 = *(r10 + 4)
uint32_t result = ascension::CWorld::GetCenterRowCard(r7)

if (result != 0)
    void* r4_1 = *(result + 0xc)
    core::CWorldBase::OutputMessageFormat(r7, "%s copies %s\n", r10 + 0x10, r4_1 + 4)
    uint32_t result_1 = result
    
    if (*(r7 + 0x30) u>= 6)
        result_1 = ascension::CWorld::CreateCard(r7)
    
    ascension::CPlayer::AddTurnLog(r10, 7)
    ascension::CWorld::PushResolveEffect(r7, result_1)
    uint32_t var_30_1 = zx.d(*(result + 8))
    ascension::CWorld::OutputAnimationCard(r7, result_1, 7, 7, arg3, 0xb, 0, 9)
    *(arg2 + 0x25c) = result_1
    result = *(r4_1 + 0x88)
    
    if (result == 1)
        int32_t r5_2 = *(r4_1 + 0xe8)
        
        if (r5_2 != 0)
            int32_t r6_1 = *(arg2 + 0x254)
            *(arg2 + 0x2b0) = result_1
            void** r0_9 = operator new(0x7a0)
            CStateList::CStateList()
            *r0_9 = _vtable_for_ascensionrules::CStateProcessCardEffect + 8
            r0_9[0xe] = r7
            r0_9[0xf] = r10
            r0_9[0x10] = r5_2
            r0_9[0x11] = r6_1
            r0_9[0x12] = arg2 + 0x260
            r0_9[0x67] = 0
            CState::SetEmbeddedStateBuffer(r0_9, 0x600)
            return CStateMachine::PushOwnedState(arg1) __tailcall

return result
