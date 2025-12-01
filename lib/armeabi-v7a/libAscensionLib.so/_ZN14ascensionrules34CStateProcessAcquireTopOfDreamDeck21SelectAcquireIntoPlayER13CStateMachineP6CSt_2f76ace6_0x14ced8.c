// 函数: _ZN14ascensionrules34CStateProcessAcquireTopOfDreamDeck21SelectAcquireIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x14ced8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg3 == 0)
    return 

arg1 = *(arg2 + 0x258)

if (arg1 s< 1)
    return 

ascension::CPlayer* r10_1 = *(arg2 + 0x24c)
int32_t r7_1 = 0
int32_t r1 = 0
ascension::CActiveEffectInstance* r8_1 = *(r10_1 + 4)

do
    void* r2 = arg2 + r7_1
    
    if (*(r2 + 0x25c) == arg3)
        void* r6 = *(r2 + 0x29c)
        
        if (r6 == 0xffffffff)
            r6 = memchr(r2 + 0x27c, 4, *(r2 + 0x278)) - (r2 + 0x27c)
        
        uint32_t r1_1 = zx.d(*(arg2 + r6 + r7_1 + 0x284))
        
        if (r1_1 != 0)
            uint32_t r0_5
            uint32_t r2_2
            
            if (zx.d(*(r8_1 + 0xb3d)) != 0)
                r2_2 = zx.d(*(r8_1 + 0xb29))
                r0_5 = r2_2
                
                if (r2_2 != 0)
                    r0_5 = 8
            
            if (zx.d(*(r8_1 + 0xb3d)) == 0 || (*(r8_1 + 0xb48) s<= 0
                    && (r2_2 == 0 || *(r8_1 + 0xb40) s< 1 || *(r8_1 + 0x30) u< 0x18)))
                ascension::CPlayer::RemoveInsightCount(r10_1)
            else
                ascensionrules::CreateStateMustPayResources(r10_1, arg3, 0, 0, r1_1, r0_5, 8, 0)
                CState::AddOwnedChild(arg2)
                CStateList::AppendState(arg2)
        
        if (zx.d(*(arg2 + (r6 << 1) + r7_1 + 0x28c)) != 0)
            core::CWorldBase::GetInstanceByID(r8_1)
            ascension::CWorld::PlayActiveEffect(r8_1)
        
        ascensionrules::CreateStateProcessAcquireCardSequence(r10_1, arg3, 0xc, 0, 4, nullptr, 0)
        CState::AddOwnedChild(arg2)
        return CStateList::AppendState(arg2) __tailcall
    
    r1 += 1
    r7_1 += 0x44
while (r1 s< arg1)
