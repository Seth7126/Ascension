// 函数: _ZN14ascensionrules35CStateProcessAcquireHeroToTopOfDeck37SelectAcquireFromCenterRowToTopOfDeckER13CStateMachineP6CStateiPj
// 地址: 0x120454
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r9 = *(arg2 + 0x24c)
uint32_t r10 = 0
int32_t r7 = *(r9 + 4)
int32_t result = ascension::CWorld::GetCenterRowCard(r7)

if (result != arg3)
    r10 = 1
    result = ascension::CWorld::GetCenterRowCard(r7)
    
    if (result != arg3)
        r10 = 2
        result = ascension::CWorld::GetCenterRowCard(r7)
        
        if (result != arg3)
            r10 = 3
            result = ascension::CWorld::GetCenterRowCard(r7)
            
            if (result != arg3)
                r10 = 4
                result = ascension::CWorld::GetCenterRowCard(r7)
                
                if (result != arg3)
                    r10 = 5
                    result = ascension::CWorld::GetCenterRowCard(r7)
                    
                    if (result != arg3)
                        result = ascension::CWorld::GetCenterRowCard(r7)
                        r10 = 7
                        
                        if (result == arg3)
                            r10 = 6

if (arg3 != 0)
    if (*(arg2 + 0x268) != 0)
        ascension::CWorld::PlayActiveEffect(r7)
    
    int32_t* r0_8 = *(arg2 + 0x264)
    
    if (r0_8 != 0)
        void* r2_1 = r0_8 + *r0_8 + 4
        uint32_t r1_9 = zx.d(*r2_1)
        
        if (r1_9 u<= 7)
            uint32_t r3 = zx.d(*(arg3 + 8))
            *r2_1 = r1_9.b + 1
            r0_8[*r0_8 * 8 + r1_9 + 4] = r3
    
    if (*(arg2 + 0x254) != 0)
    label_120590:
        int32_t var_2c = 2
        ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
            operator new(0x990), r9, arg3, 7, r10)
        CState::AddOwnedChild(arg2)
        return CStateList::AppendState(arg2) __tailcall
    
    result = *(arg2 + 0x26c)
    
    if (result s>= 1)
        void* __offset(CState, 0x2b0) r6_2 = arg2 + 0x2b0
        int32_t r1_14 = 0
        
        while (*(r6_2 - 0x40) != arg3)
            r1_14 += 1
            r6_2 += 0x44
            
            if (r1_14 s>= result)
                return result
        
        void* r0_17 = *r6_2
        
        if (r0_17 == 0xffffffff)
            r0_17 = memchr(r6_2 - 0x20, 2, *(r6_2 - 0x24)) - (r6_2 - 0x20)
        
        if (zx.d(*(r6_2 + (r0_17 << 1) - 0x10)) != 0)
            core::CWorldBase::GetInstanceByID(r7)
            ascension::CWorld::PlayActiveEffect(r7)
        
        goto label_120590

return result
