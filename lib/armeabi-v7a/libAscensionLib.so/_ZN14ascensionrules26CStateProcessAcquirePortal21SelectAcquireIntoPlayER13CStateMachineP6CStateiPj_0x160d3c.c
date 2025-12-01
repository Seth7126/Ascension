// 函数: _ZN14ascensionrules26CStateProcessAcquirePortal21SelectAcquireIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x160d3c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg3 == 0)
    return 

arg1 = *(arg2 + 0x268)

if (arg1 s< 1)
    return 

ascension::CPlayer* r8_1 = *(arg2 + 0x24c)
int32_t r6_1 = 0
int32_t r1 = 0
int32_t r10_1 = *(r8_1 + 4)

do
    void* r2 = arg2 + r6_1
    
    if (*(r2 + 0x26c) == arg3)
        void* r7 = *(r2 + 0x2ac)
        
        if (r7 == 0xffffffff)
            r7 = memchr(r2 + 0x28c, 4, *(r2 + 0x288)) - (r2 + 0x28c)
        
        uint32_t r1_1 = zx.d(*(arg2 + r7 + r6_1 + 0x294))
        
        if (r1_1 != 0)
            uint32_t r0_5
            uint32_t r2_2
            
            if (zx.d(*(r10_1 + 0xb3d)) != 0)
                r2_2 = zx.d(*(r10_1 + 0xb29))
                r0_5 = r2_2
                
                if (r2_2 != 0)
                    r0_5 = 8
            
            if (zx.d(*(r10_1 + 0xb3d)) == 0
                    || (*(r10_1 + 0xb48) s<= 0 && (r2_2 == 0 || *(r10_1 + 0xb40) s< 1)))
                ascension::CPlayer::RemoveInsightCount(r8_1)
            else
                ascensionrules::CreateStateMustPayResources(r8_1, arg3, 0, 0, r1_1, r0_5, 8, 0)
                CState::AddOwnedChild(arg2)
                CStateList::AppendState(arg2)
        
        if (zx.d(*(arg2 + (r7 << 1) + r6_1 + 0x29c)) != 0)
            core::CWorldBase::GetInstanceByID(r10_1)
            ascension::CWorld::PlayActiveEffect(r10_1)
        
        uint32_t r2_6 = *(arg2 + 0x254)
        
        if (r2_6 == 7)
            ascension::CWorld::RemoveCenterRowCard(r10_1, (*(arg2 + 0x258)).b)
            ascension::CWorld::PutCardOnCenterRow(r10_1, *(arg2 + 0x258), arg3)
            r2_6 = *(arg2 + 0x254)
        
        ascensionrules::CreateStateProcessAcquireCardSequence(r8_1, arg3, r2_6, *(arg2 + 0x258), 4, 
            nullptr, 0)
        CState::AddOwnedChild(arg2)
        return CStateList::AppendState(arg2) __tailcall
    
    r1 += 1
    r6_1 += 0x44
while (r1 s< arg1)
