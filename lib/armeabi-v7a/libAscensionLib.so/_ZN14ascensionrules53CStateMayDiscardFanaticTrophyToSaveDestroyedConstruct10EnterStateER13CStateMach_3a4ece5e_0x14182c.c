// 函数: _ZN14ascensionrules53CStateMayDiscardFanaticTrophyToSaveDestroyedConstruct10EnterStateER13CStateMachine
// 地址: 0x14182c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r0 = *(arg1 + 0x24c)
*(arg1 + 0x254) = 0
int32_t* r7 = *(r0 + 0x60)
int32_t result = *(r0 + 0x64)

if (r7 != result)
    while (true)
        if (strcasecmp((*(**r7 + 0xc))(), "Fanatic SoS") == 0)
            result = *r7
            *(arg1 + 0x254) = result
            
            if (result == 0)
                break
        else
            r7 = &r7[1]
            
            if (r7 != *(*(arg1 + 0x24c) + 0x64))
                continue
            else
                result = *(arg1 + 0x254)
                
                if (result == 0)
                    break
        
        void* r0_6 = *(arg1 + 0x250)
        int32_t* i = *(r0_6 + 0x50)
        
        if (i != *(r0_6 + 0x54))
            do
                void* r0_8 = *i
                i = &i[1]
                void* var_24_1 = r0_8
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_8 + 8), 0xa055, "Prevent %s", 
                    ascensionrules::CStateMayDiscardFanaticTrophyToSaveDestroyedConstruct::SelectConstructToSave)
            while (i != *(*(arg1 + 0x250) + 0x54))
        
        int32_t var_24_2 = 0
        CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
        *(arg1 + 0x24c)
        jump(*(*arg1 + 0x34))

return result
