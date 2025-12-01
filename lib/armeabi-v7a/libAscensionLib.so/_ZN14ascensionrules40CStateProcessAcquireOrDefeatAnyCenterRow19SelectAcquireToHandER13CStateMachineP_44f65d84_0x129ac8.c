// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow19SelectAcquireToHandER13CStateMachineP6CStateiPj
// 地址: 0x129ac8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r8 = *(arg2 + 0x24c)
ascension::CActiveEffectInstance* r5 = *(r8 + 4)
uint32_t r0_1 = ascension::CWorld::GetCenterRowCard(r5)

if (r0_1 != 0)
    uint32_t r7_1 = r0_1
    r0_1 = *(arg2 + 0x25c)
    
    if (r0_1 s>= 1)
        void* __offset(CState, 0x2a0) r6_1 = arg2 + 0x2a0
        int32_t r1_1 = 0
        
        do
            if (r7_1 == *(r6_1 - 0x40))
                void* r0_2 = *r6_1
                
                if (r0_2 == 0xffffffff)
                    r0_2 = memchr(r6_1 - 0x20, 1, *(r6_1 - 0x24)) - (r6_1 - 0x20)
                
                if (zx.d(*(r6_1 + (r0_2 << 1) - 0x10)) != 0)
                    core::CWorldBase::GetInstanceByID(r5)
                    ascension::CWorld::PlayActiveEffect(r5)
                
                int32_t var_2c = 1
                ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
                    operator new(0x990), r8, r7_1, 7, arg3)
                CState::AddOwnedChild(arg2)
                int32_t r0_12 = CStateList::AppendState(arg2)
                *(arg2 + 0xcec) = 1
                return r0_12
            
            r1_1 += 1
            r6_1 += 0x44
        while (r1_1 s< r0_1)

return r0_1
