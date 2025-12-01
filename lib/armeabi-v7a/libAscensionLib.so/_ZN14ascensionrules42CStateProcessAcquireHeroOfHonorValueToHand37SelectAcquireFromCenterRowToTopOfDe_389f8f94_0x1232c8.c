// 函数: _ZN14ascensionrules42CStateProcessAcquireHeroOfHonorValueToHand37SelectAcquireFromCenterRowToTopOfDeckER13CStateMachineP6CStateiPj
// 地址: 0x1232c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r8 = *(arg2 + 0x24c)
ascension::CActiveEffectInstance* r5 = *(r8 + 4)
uint32_t result = ascension::CWorld::GetCenterRowCard(r5)

if (result != 0)
    uint32_t result_1 = result
    result = *(arg2 + 0x254)
    
    if (result s>= 1)
        void* __offset(CState, 0x298) r6_1 = arg2 + 0x298
        int32_t r1_1 = 0
        
        do
            if (result_1 == *(r6_1 - 0x40))
                void* r0_1 = *r6_1
                
                if (r0_1 == 0xffffffff)
                    r0_1 = memchr(r6_1 - 0x20, 2, *(r6_1 - 0x24)) - (r6_1 - 0x20)
                
                if (zx.d(*(r6_1 + (r0_1 << 1) - 0x10)) != 0)
                    core::CWorldBase::GetInstanceByID(r5)
                    ascension::CWorld::PlayActiveEffect(r5)
                
                int32_t var_2c = 2
                ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
                    operator new(0x990), r8, result_1, 7, arg3)
                CState::AddOwnedChild(arg2)
                return CStateList::AppendState(arg2) __tailcall
            
            r1_1 += 1
            r6_1 += 0x44
        while (r1_1 s< result)

return result
