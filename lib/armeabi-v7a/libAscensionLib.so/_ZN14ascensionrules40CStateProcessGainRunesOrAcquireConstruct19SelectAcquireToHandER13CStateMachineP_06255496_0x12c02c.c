// 函数: _ZN14ascensionrules40CStateProcessGainRunesOrAcquireConstruct19SelectAcquireToHandER13CStateMachineP6CStateiPj
// 地址: 0x12c02c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r10 = *(arg2 + 0x24c)
ascension::CActiveEffectInstance* r6 = *(r10 + 4)
uint32_t result = ascension::CWorld::GetCenterRowCard(r6)

if (result != 0)
    uint32_t result_1 = result
    result = *(arg2 + 0x258)
    
    if (result s>= 1)
        void* __offset(CState, 0x29c) r5_1 = arg2 + 0x29c
        int32_t r1_1 = 0
        
        do
            if (result_1 == *(r5_1 - 0x40))
                void* r0_1 = *r5_1
                
                if (r0_1 == 0xffffffff)
                    r0_1 = memchr(r5_1 - 0x20, 1, *(r5_1 - 0x24)) - (r5_1 - 0x20)
                
                if (zx.d(*(r5_1 + (r0_1 << 1) - 0x10)) != 0)
                    core::CWorldBase::GetInstanceByID(r6)
                    ascension::CWorld::PlayActiveEffect(r6)
                
                uint32_t var_30 = zx.d(*(r10 + 8))
                ascension::CWorld::OutputEvent(r6, 5, zx.d(*(*(arg2 + 0x254) + 8)), 
                    zx.d(*(result_1 + 8)))
                int32_t var_2c = 1
                ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
                    operator new(0x990), r10, result_1, 7, arg3)
                CState::AddOwnedChild(arg2)
                return CStateList::AppendState(arg2) __tailcall
            
            r1_1 += 1
            r5_1 += 0x44
        while (r1_1 s< result)

return result
